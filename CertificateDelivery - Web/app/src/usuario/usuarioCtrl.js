angular.module('app')
    .controller('usuarioCtrl', function($scope, $http){
    
    $scope.usuario = inicializar();
    
    $scope.usuario={
        "permissao": []
    };
    
    $scope.permissao={};
    $scope.permissoes=[];
    
    $scope.sucesso = false;

    $http.get("http://localhost:8080/public/permissao/listaTodos")
    .success(function(data){
        $scope.permissoes=data;
        console.log(data);
        
    })
    .error(function(error){
        console.log("Erro ao listar permissoes");
    });

    $scope.cadastrarUsuario = function(usuario){  
        $http.post("http://localhost:8080/public/usuario/save", usuario)
            .success(function(data){                
        
                $scope.usuario = data;
                //$scope.usuario.push(data);
            
                $scope.usuario = inicializar();
            
                $scope.cadUsuario.$setUntouched();
                $scope.cadUsuario.$setPristine();
                
                $scope.finalSucesso();
                
                console.log("Usuario cadastrado com sucesso!!");
            })
            .error(function(error){ 
                console.log("Erro ao cadastrar usuario");
            });
    };
    
    $scope.finalSucesso = function(){
        $scope.sucesso = true;
    }
});

function inicializar(){
    return {
        nome : "",
        //permissao : "permissao[1].id",
        email : "",
        senha: "" 
    }
}


//$http.post("http://localhost:8080/usuario/save", usuario)
        /*$http.post("http://localhost:8080/public/usuario/save")
        .success(function(data){                
        
            //$scope.usuario = data;
            $scope.usuario.push(data);
            
            $scope.usuario = inicializar();
            
            $scope.cadUsuario.$setUntouched();
            $scope.cadUsuario.$setPristine();
            
            $scope.finalSucesso();
            
            console.log("Usuario cadastrado com sucesso!!");
        })
        .error(function(error){ 
            console.log("Erro ao cadastrar usuario");
        });*/

