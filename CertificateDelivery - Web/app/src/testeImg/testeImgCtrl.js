angular.module('app')
    .controller('testeImgCtrl', function($scope, $http, $q){
    
    console.log("Chamou o controller de testeImg");
    
    $scope.testeImg={};
    
    $scope.cadastrarImg = function(testeImg){
        $http.post("http://localhost:8080/teste/save", testeImg)
        .success(function(data){
            $scope.testeImg = data;
        })
        .error(function(error){
            console.log("Erro ao inserir evento, tente novamente!!!");
        })
    };
    
    $scope.confImagem = function(file, base64){
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