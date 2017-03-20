angular.module('app')
    .controller('usuarioCtrl', function($scope, $http){
    
    $scope.usuario={
        "permissao": []
    };
    $scope.permissao={};
    $scope.permissoes=[];
    
   
        $http.get("http://localhost:8080/permissao/listaTodos")
        .success(function(data){
            $scope.permissoes=data;
            console.log("Listando");
            console.log(data);
            
        })
        .error(function(error){
            console.log("Erro ao listar permissoes");
        });
   
    
    $scope.cadastrarUsuario = function(usuario){
        $http.post("http://localhost:8080/usuario/save", usuario)
        .success(function(response){                
        
            $scope.usuario.push(response.data);
            
            console.log("Usuario cadastrado com sucesso!!");
        })
        .error(function(error){ 
            console.log("Erro ao cadastrar usuario");
        });
    }

    
});

