angular.module('app')
    .controller('eventosSelecionaCtrl', function($scope, $http, $routeParams){

    $scope.evento={};
    $scope.eventos=[];
    
    var id = $routeParams.id;
    
    $scope.ap = false;
    $scope.esc = true;
    
    $http.get("http://localhost:8080/evento/listaUnico/" + id)
    .success(function(data){
        $scope.eventos = data;    
    })
        .error(function(data){
        console.log("Erro ao lista o evento");
    })
    
    
    $scope.aparecerModal = function(){
       // $scope.modals = true;
        $scope.ap = true;
        $scope.esc = false;
        $scope.modals = true;
    };
    
    $scope.fecharModal = function(){
        //$scope.modals = false;
        $scope.ap = false;
        $scope.esc = true;
        $scope.modals = false;
    }
    
    
})