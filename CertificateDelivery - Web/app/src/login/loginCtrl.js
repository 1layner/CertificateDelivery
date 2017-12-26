angular.module('app')
    .controller('LoginCtrl', function($scope, LoginLogoutSrv){
    
    $scope.login = function(email, senha){
        LoginLogoutSrv.login(email, senha);
    
    }
});