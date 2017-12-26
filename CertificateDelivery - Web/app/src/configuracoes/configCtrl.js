angular.module('app')
    .controller('configCtrl', function($scope, $http, $location, $q){
    
    iniciar();
    
    $scope.usuario={};
    
    $scope.alterar = function(){
        $scope.altone=false;
        $scope.alttwo=true;
    };
    
    $scope.cancelar = function(){
        $scope.altone = true;
        $scope.alttwo = false;
    };
        
    
        //$http.get("http://localhost:8080/public/usuario/listaUnico/3")
        $http.get("http://localhost:8080/public/usuario/configuracoes")
        .success(function(data){
            $scope.usuario = data;    
            console.log(data); 
        })
        .error(function(error){
            console.log("Erro ao listar configuracoes de usuario");
        });
    
    $scope.salvarConfig = function(usuario){
        var requestParams = {
            headers:{'Content-type':'application/json'},
            url: 'http://localhost:8080/private/usuario/update',
            method: 'PUT',
            data: usuario
        };
        
        $http(requestParams).then(function success(response){
           $scope.configUsuario.$setUntouched();
            $scope.configUsuario.$setPristine();
              
            $scope.finalizaSucesso();
           
           $scope.usuario.push(response.data); 
        });
        
       /* var requestParams={
            headers:{'Content-type': 'application/json'},
            url: 'http://localhost:8080/public/usuario/save',
            method: 'POST',
            data: usuario
        };
        $http(requestParams).then(function success(response){
            
        
            $scope.configUsuario.$setUntouched();
            $scope.configUsuario.$setPristine();
              
            $scope.finalizaSucesso();
            
            $scope.cancelar();
                  
            //$scope.finalizaModal();
            
            $scope.usuario.push(response.data);
        });*/
        
     /* $http.post("http://localhost:8080/private/usuario/update", usuario)
      .success(function(data){
          if(usuario.id){
              $scope.usuario = data;
              console.log(data);     
              
              $scope.configUsuario.$setUntouched();
              $scope.configUsuario.$setPristine();
              
              $scope.finalizaSucesso();
              
              $scope.finalizaModal();
              console.log("Usuario Alterado com Sucesso");
          }   
           
      })
      .error(function(error){
         console.log("Erro ao atualizar usuario!!"); 
      }); */
    };
    
    
    $scope.finalizaSucesso = function(){
        $scope.sucesso = true;
    }
    
    $scope.finalizaModal = function(){
        $scope.recurso = true;
    }
    

        //$location.path('/cadUsuario');


    
    function iniciar(){
       $scope.altone=true;
    };
   
});
