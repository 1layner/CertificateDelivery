angular.module('app')
    .controller('meusEventosInscCtrl', function($scope, $http, $routeParams, $location){
    
    $scope.evento={};
    $scope.eventos=[];
    
    $http.get("http://localhost:8080/evento/listaInscritos/1")
    .success(function(data){
        $scope.eventos = data;
        console.log('listando eventos inscritos');
    })
    .error(function(error){
        console.log('erro ao lista eventos inscritos');
    });
    
    $scope.abrirEvento = function(evento){
        $location.path("/eventosInscSeleciona/" + evento.id)
    }
    
})