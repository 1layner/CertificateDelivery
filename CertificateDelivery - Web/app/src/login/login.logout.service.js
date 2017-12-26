angular.module('app')
    .service('LoginLogoutSrv', function($http, $cookies, $rootScope, $location, $localStorage/*, ngNotify*/, SERVICE_PATH){
    
    var serviceFactory = {};
    var urlLogin = SERVICE_PATH.PUBLIC_PATH + "/login";
    var urlLogout = SERVICE_PATH.PRIVATE_PATH + "/logout";
    
    serviceFactory.login = function(email, senha){
        var requestParams = {
            method: 'GET',
            url: urlLogin,
            headers:{
                'Content-type' : 'application/json',
                'authorization' : 'Basic ' + btoa(email + ':' + senha)
            }
        };
        
        $http(requestParams).then(
            function success(response){
                var data = response.data;
                
                if(data.name){
                    $rootScope.authDetails = {name: data.name, authenticated: data.authenticated, permissions: data.authorities};
                    $localStorage.authDetails = $rootScope.authDetails;
                    $location.path('/');
                }
                else{
                    $rootScope.authDetails = {name: '', authenticated: false, permissions: [] };
                }
            },
            
            function failure(response){
                $rootScope.authDetails = {name: '', authenticated: false, permissions: [] };
            }
        );        
    };
    
    serviceFactory.logout = function(){
        var requestParams = {
            method: 'POST',
            url: urlLogout,
            headers : {'Content-Type' : 'application/json'}
        };
        
        $http(requestParams).finally(function success(response){
            delete $localStorage.authDetails;
            $rootScope.authDetails = {name: '', authenticated: false, permissions: [] };
            $location.path("/cadUsuario");
        });
    };
    
    serviceFactory.verifyAuth = function(){
        if($localStorage.authDetails){
            $rootScope.authDetails = $localStorage.authDetails;
        }
    };
    
    return serviceFactory;
});