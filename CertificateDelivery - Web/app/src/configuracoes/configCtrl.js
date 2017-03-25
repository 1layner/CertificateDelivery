angular.module('app')
    .controller('configCtrl', function($scope, $http){
    
    $scope.usuario=[];
    
    $http.get("http://localhost:8080/usuario/listaUnico/23")
    .sucess(function(data){
        $scope.usuario=data;
        console.log(data);
    })
    .error(function(error){
        console.log("Erro ao listar usuarios");
    })
})