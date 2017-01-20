'use strict';

//  Dojomanager Schoolstudent Controller
catwalkApp.controller('DojomanagerSchoolstudentController', ['$scope','$location','$stateParams','$global.services', 'DojomanagerSchoolstudent',
    function ($scope,location,$stateParams,$services, service) {
        $scope.name = "Schoolstudent";
        $scope.listParams = {rows:12,page:1,defaultsearchoper:"icn"};
        $scope.srchterm = '';

        $scope.get = function(id){
            $scope.modelData = service.get({id: id});
        };
        $scope.setPage = function(page){
            $scope.listParams.page = page;
            $scope.list();
        };
        $scope.search = function(){
            if($scope.srchterm && $scope.srchterm !== '' ){
                $scope.listParams['filterByFields'] =  {'name':$scope.srchterm};
            }else{
                $scope.listParams['filterByFields'] = {};
            }
            $scope.list();
        };
        $scope.save = function(){
            service.save($scope.modelData,function(){
                  $scope.back();
            });
        };

        $scope.list = function(){
            $scope.modelList = service.query($scope.listParams);
        };

        $scope.remove = function(id){
            service.delete({id: id}, function () {

            });
        };

        $scope.new= function(){
            location.path('/dojomanager/schoolstudent/');
        };

        $scope.update= function(id){
            location.path('/dojomanager/schoolstudent/' + id);
        };

        $scope.back = function () {
            window.history.back();
        };

        if($stateParams.id){ $scope.get($stateParams.id);}
        else{ $scope.list();}
    }
]);

//  Dojomanager Schoolstudent Routing
catwalkApp.config(['$stateProvider', '$urlRouterProvider','USER_ROLES',
    function ($stateProvider, $urlRouterProvider, USER_ROLES) {
        $stateProvider
        .state('dojomanager.schoolstudent', {
            url: "/schoolstudent",
            templateUrl: "components/model/schoolstudent/schoolstudentTable.html",
            controller: 'DojomanagerSchoolstudentController',
            access: {
                authorizedRoles: [USER_ROLES.all]
            }
        })
        .state('dojomanager.schoolstudentForm', {
            url: "/schoolstudent/:id",
            templateUrl: "components/model/schoolstudent/schoolstudentForm.html",
            controller: 'DojomanagerSchoolstudentController',
            access: {
                authorizedRoles: [USER_ROLES.all]
            }
        })
     }
]);
