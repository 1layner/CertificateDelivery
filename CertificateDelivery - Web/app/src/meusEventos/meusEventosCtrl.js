angular.module('app')
    .controller('meusEventosCtrl', function($scope, $http){
    
    $scope.evento={};
    $scope.eventos=[];
    
    $http.get("http://localhost:8080/evento/listaTodos")
    .success(function(data){
        $scope.eventos = data;
        console.log("Listando todos os eventos");
        console.log(data);
    })
    .error(function(data){
        console.log("Erro ao listar eventos");
    })
})
