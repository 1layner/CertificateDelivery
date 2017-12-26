var BASE_URL = 'http://localhost:8081';

angular.module('app', ['ngRoute', 'ngQuill', 'ngResource', 'ngSanitize', 'naif.base64', 'checklist-model', 'ngNotify', 'ngCookies', 'ngStorage'])
    .constant('SERVICE_PATH', {
        'ROOT_PATH': BASE_URL,
        'PUBLIC_PATH': BASE_URL + '/public',
        'PRIVATE_PATH': BASE_URL + '/private'
    })

    .config(function($routeProvider){
       $routeProvider.
            when('/',{
                templateUrl: 'src/usuario/cadUsuario',
                controller: 'usuarioCtrl'
            })               
            .when('/login', {
                templateUrl : 'src/login/login.html',
                controller : 'LoginCtrl'
            })
            .when('/cadUsuario', {
                templateUrl: 'src/usuario/usuario.html',
                controller: 'usuarioCtrl'
            })
            .when('/confUsuario', {
                templateUrl: 'src/configuracoes/configuracoes.html',
                controller: 'configCtrl'
            })
            .when('/meusEventos', {
                templateUrl: 'src/meusEventos/meusEventos.html',
                controller: 'meusEventosCtrl'
            })
            .when('/eventosSeleciona/:id', {
                templateUrl : 'src/meusEventos/eventosSeleciona.html',
                controller: 'eventosSelecionaCtrl'
            })
            .when('/meusEventosInsc', {
                templateUrl : 'src/meusEventosInscritos/meusEventosInscritos.html',
                controller : 'meusEventosInscCtrl'
            })
            .when('/eventosInscSeleciona/:id', {
                templateUrl : 'src/meusEventosInscritos/eventosInscSeleciona.html',
                controller : 'eventosInscSelecionaCrtl'
            })
            .when('/cadEvento', {
                templateUrl : 'src/evento/evento.html',
                controller : 'eventoCtrl'
            })
            .when('/lock', {
                templateUrl: 'src/testeImg/testeImg.html',
                controller: 'src/testeImg/testeImg.html'
            })
    })
    .config(function($httpProvider){
        //$httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
        $httpProvider.defaults.withCredentials=true;
        //$httpProvider.interceptors.push('httpRequestInterceptor');
    })
    .run(function($rootScope, ngNotify, LoginLogoutSrv){
        $rootScope.authDetails = {name : '', authenticated: false, permissions:[]};
    
        ngNotify.config({
            theme: 'pastel'
        });
    
        LoginLogoutSrv.verifyAuth();
    });