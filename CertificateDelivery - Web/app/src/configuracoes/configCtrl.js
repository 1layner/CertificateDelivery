angular.module('app')
    .controller('configCtrl', function($scope, $http){
    
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
        
    
        $http.get("http://localhost:8080/usuario/listaUnico/3")
        .success(function(data){
            $scope.usuario = data;    
            console.log(data); 
        })
        .error(function(error){
            console.log("Erro ao listar configuracoes de usuario");
        });
    
    $scope.salvarConfig = function(usuario){
      $http.post("http://localhost:8080/usuario/update", usuario)
      .success(function(data){
          if(usuario.id){
              delete usuario.senha;
              $scope.usuario.push(response.data);
              console.log(data);     
              console.log("Usuario Alterado com Sucesso");
          }   
      })
      .error(function(error){
         console.log("Erro ao atualizar usuario!!"); 
      }); 
    };
    

    function iniciar(){
       $scope.altone=true;
    };
   
});
