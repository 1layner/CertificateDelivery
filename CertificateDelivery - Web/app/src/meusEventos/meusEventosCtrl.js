angular.module('app')
    .controller('meusEventosCtrl', function($scope, $http, $routeParams, $location){
    
    $scope.evento={};
    $scope.eventos=[];
    
    
    $http.get("http://localhost:8080/evento/1")
    .success(function(data){
        $scope.eventos = data;
        console.log("Listando todos os eventos");
        console.log(data);
    })
    .error(function(data){
        console.log("Erro ao listar eventos");
    });

    //metodo visualizar
    
    $scope.visualizar = function(evento){
        $location.path("/eventosSeleciona/" +  evento.id)
    }
    
})
