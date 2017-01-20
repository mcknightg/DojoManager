'use strict';

//  Dojomanager Student Service
catwalkApp.factory('DojomanagerStudent', ['DojomanagerBaseService',function (DojomanagerBaseService) {
    var entityUrl = DojomanagerBaseService.getEntityUrl('student');
    return DojomanagerBaseService.getResource(entityUrl,{},{
        'columns':{method: 'POST', params:{},url:entityUrl + 'columns'},
        'api':{method: 'POST', params:{},url:entityUrl + 'api'},
        'schema':{method: 'POST', params:{},url:entityUrl + 'schema'}
    });
}
]);
