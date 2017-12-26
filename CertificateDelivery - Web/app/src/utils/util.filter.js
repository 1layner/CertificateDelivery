angular.module('app')
    .filter('formatPermission', function(){
    
    return function(input){
        switch(input){
            case 'ROLE_ORGANIZADOR':
                return 'Organizador';
            break;
                
            case 'ROLE_PALESTRANTE':
                return 'Palestrante';
            break;
                
            case 'ROLE_OUVINTE':
                return 'Ouvinte';
            break;
                
            default:
                return 'Unknown';
            break;
        };
    };
});