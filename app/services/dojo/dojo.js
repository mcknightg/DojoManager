'use strict';

//  Dojomanager Dojo Service
catwalkApp.factory('DojomanagerDojo', ['DojomanagerBaseService',function (DojomanagerBaseService) {
    var entityUrl = DojomanagerBaseService.getEntityUrl('dojo');
    return DojomanagerBaseService.getResource(entityUrl,{},{
        'columns':{method: 'POST', params:{},url:entityUrl + 'columns'},
        'api':{method: 'POST', params:{},url:entityUrl + 'api'},
        'schema':{method: 'POST', params:{},url:entityUrl + 'schema'}
    });
}
]);
