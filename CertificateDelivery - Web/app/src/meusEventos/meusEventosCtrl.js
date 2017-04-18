angular.module('app')
    .controller('meusEventosCtrl', function($scope, $http){
    
    $scope.evento={};
    $scope.eventos=[];
    $scope.eventosc = [];
    
    $http.get("http://localhost:8080/evento/1")
    .success(function(data){
        $scope.eventos = data;
        console.log("Listando todos os eventos");
        console.log(data);
    })
    .error(function(data){
        console.log("Erro ao listar eventos");
    });
    
    
    $scope.visualizar = function(evento){
        $http.get("http://localhost:8080/evento/3")
        .success(function(data){
            $scope.eventosc = data;
        })
        .error(function(data){
            console.log("Erro ao lista o evento");
        })
    }
})
