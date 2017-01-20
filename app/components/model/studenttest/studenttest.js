'use strict';

//  Dojomanager Studenttest Controller
catwalkApp.controller('DojomanagerStudenttestController', ['$scope','$location','$stateParams','$global.services', 'DojomanagerStudenttest',
    function ($scope,location,$stateParams,$services, service) {
        $scope.name = "Studenttest";
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
            location.path('/dojomanager/studenttest/');
        };

        $scope.update= function(id){
            location.path('/dojomanager/studenttest/' + id);
        };

        $scope.back = function () {
            window.history.back();
        };

        if($stateParams.id){ $scope.get($stateParams.id);}
        else{ $scope.list();}
    }
]);

//  Dojomanager Studenttest Routing
catwalkApp.config(['$stateProvider', '$urlRouterProvider','USER_ROLES',
    function ($stateProvider, $urlRouterProvider, USER_ROLES) {
        $stateProvider
        .state('dojomanager.studenttest', {
            url: "/studenttest",
            templateUrl: "components/model/studenttest/studenttestTable.html",
            controller: 'DojomanagerStudenttestController',
            access: {
                authorizedRoles: [USER_ROLES.all]
            }
        })
        .state('dojomanager.studenttestForm', {
            url: "/studenttest/:id",
            templateUrl: "components/model/studenttest/studenttestForm.html",
            controller: 'DojomanagerStudenttestController',
            access: {
                authorizedRoles: [USER_ROLES.all]
            }
        })
     }
]);
