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
                templateUrl : 'src/evento/evento.html'
                //controller : 'eventoCtrl'
            })
    });