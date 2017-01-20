'use strict';

//  Dojomanager Schoolstudent Service
catwalkApp.factory('DojomanagerSchoolstudent', ['DojomanagerBaseService',function (DojomanagerBaseService) {
    var entityUrl = DojomanagerBaseService.getEntityUrl('schoolstudent');
    return DojomanagerBaseService.getResource(entityUrl,{},{
        'columns':{method: 'POST', params:{},url:entityUrl + 'columns'},
        'api':{method: 'POST', params:{},url:entityUrl + 'api'},
        'schema':{method: 'POST', params:{},url:entityUrl + 'schema'}
    });
}
]);
