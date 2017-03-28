angular.module('app', ['ngRoute'])
    .config(function($routeProvider){
       $routeProvider.
            when('/', {
                templateUrl: 'src/teste/teste.html'
            })
            .when('/cadUsuario', {
                templateUrl: 'src/usuario/usuario.html',
                controller: 'usuarioCtrl'
            })
            .when('/confUsuario', {
                templateUrl: 'src/configuracoes/configuracoes.html',
                controle: 'configCtrl'
            })
       
    });