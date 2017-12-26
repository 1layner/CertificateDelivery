angular.module('app')
    .controller('headerSrv', function($scope, $rootScope, $location, LoginLogoutSrv){
    
    $scope.hasAnyPermission = function(authorities){
        var hasPermission = false;
        
        $rootScope.authDetails.permissao.forEach(function(permissao){
            authorities.forEach(function(authority){
                if(permissao.authority === authority){
                    hasPermission = true;
                }
            });
        });
        
        return hasPermission;
    };
    
    $scope.logout = function(){
        LoginLogoutSrv.logout();
    };
    
});