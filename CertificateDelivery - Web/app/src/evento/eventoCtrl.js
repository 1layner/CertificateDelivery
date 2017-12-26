angular.module('app')
    .controller('eventoCtrl', function($scope, $http, $q){
    
    console.log("Chamou o controller evento");
    
    //$scope.evento={};
    $scope.evento={};
    
    // 25/12/2017
    $scope.gerandoRandom = function(){ 

        $scope.linkInscricao = 0;
        
        $scope.linkInscricao = Math.round((Math.random() * 1000) * 10000);
        
        console.log("Numero de Inscricao" + $scope.linkInscricao);
    };
    
    $scope.cadastrarEvento = function(evento){
        $http.post("http://localhost:8080/public/evento/save", evento)
        .success(function(data){
            
            // 25/12/2017
            $scope.gerandoRandom();
            
            $scope.evento = data;
        })
        .error(function(error){
            console.log("Erro ao inserir evento, tente novamente!!!");
        })
    };
    
    $scope.configuracaoImagens = function(file, base64){
        var deferred = $q.defer();
        var img = document.createElement('img');
        
        img.onload = function(){
            var canvas = document.createElement('canvas');
            var ctx = canvas.getContext('2d');
            
            canvas.width = 100;
            canvas.height = 100;
            
            ctx.drawImage(this, 0, 0, 100, 100);
            
            var dataURI = canvas.toDataURL(1.0);
            base64.base64 = dataURI.replace('data:image/png;base64,', '');
            deferred.resolve(base64);
            
            $scope.$apply();
        };
        img.src = 'data:' + base64.filetype + ';base64,' + base64.base64;
        return deferred.promise;
    }
    
   
    
});