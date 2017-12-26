angular.module('app')
    .controller('meusEventosCtrl', function($scope, $http, $routeParams, $location, SERVICE_PATH){
    
    $scope.evento={};
    $scope.eventos=[];
    
    
    //$http.get("http://localhost:8080/private/evento/2")
    //$http.get(SERVICE_PATH.PRIVATE_PATH + "/evento/1")
    $http.get("http://localhost:8080/private/evento/retornaMeusEventos")
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
