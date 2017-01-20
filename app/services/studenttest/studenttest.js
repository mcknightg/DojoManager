'use strict';

//  Dojomanager Studenttest Service
catwalkApp.factory('DojomanagerStudenttest', ['DojomanagerBaseService',function (DojomanagerBaseService) {
    var entityUrl = DojomanagerBaseService.getEntityUrl('studenttest');
    return DojomanagerBaseService.getResource(entityUrl,{},{
        'columns':{method: 'POST', params:{},url:entityUrl + 'columns'},
        'api':{method: 'POST', params:{},url:entityUrl + 'api'},
        'schema':{method: 'POST', params:{},url:entityUrl + 'schema'}
    });
}
]);
