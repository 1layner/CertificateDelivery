angular.module('app', ['ngRoute'])
    .config(function($routeProvider){
       $routeProvider.
            when('/cadUsuario', {
                templateUrl: 'src/usuario/usuario.html',
                //controller: 'UsuarioCtrl'
            })
       
    });