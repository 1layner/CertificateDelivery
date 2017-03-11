angular.module('app')
    .controller('usuarioCtrl', function($scope, $http){
    
    $scope.usuario={};
    $scope.permissao={};
    $scope.permissoes=[];
    
   
        $http.get("http://localhost:8080/permissao/listaTodos")
        .success(function(data){
            $scope.permissoes=data;
            console.log("Listando");
            console.log(data);
            
        })
        .error(function(error){
            alert("Erro ao listar permissoes");
        });
   
    
    $scope.cadastrarUsuario = function(usuario){
        $http.post("http://localhost:8080/usuario/save", usuario)
        .success(function(data){
            console.log("Usuario cadastrado com sucesso!!");
            console.log(data);
        })
        .error(function(error){
            alert("Erro ao cadastrar usuario");
        });
    }
});