'use strict';

//  Dojomanager Testing Service
catwalkApp.factory('DojomanagerTesting', ['DojomanagerBaseService',function (DojomanagerBaseService) {
    var entityUrl = DojomanagerBaseService.getEntityUrl('testing');
    return DojomanagerBaseService.getResource(entityUrl,{},{
        'columns':{method: 'POST', params:{},url:entityUrl + 'columns'},
        'api':{method: 'POST', params:{},url:entityUrl + 'api'},
        'schema':{method: 'POST', params:{},url:entityUrl + 'schema'}
    });
}
]);
