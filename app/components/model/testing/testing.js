'use strict';

//  Dojomanager Testing Controller
catwalkApp.controller('DojomanagerTestingController', ['$scope','$location','$stateParams','$global.services', 'DojomanagerTesting',
    function ($scope,location,$stateParams,$services, service) {
        $scope.name = "Testing";
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
            location.path('/dojomanager/testing/');
        };

        $scope.update= function(id){
            location.path('/dojomanager/testing/' + id);
        };

        $scope.back = function () {
            window.history.back();
        };

        if($stateParams.id){ $scope.get($stateParams.id);}
        else{ $scope.list();}
    }
]);

//  Dojomanager Testing Routing
catwalkApp.config(['$stateProvider', '$urlRouterProvider','USER_ROLES',
    function ($stateProvider, $urlRouterProvider, USER_ROLES) {
        $stateProvider
        .state('dojomanager.testing', {
            url: "/testing",
            templateUrl: "components/model/testing/testingTable.html",
            controller: 'DojomanagerTestingController',
            access: {
                authorizedRoles: [USER_ROLES.all]
            }
        })
        .state('dojomanager.testingForm', {
            url: "/testing/:id",
            templateUrl: "components/model/testing/testingForm.html",
            controller: 'DojomanagerTestingController',
            access: {
                authorizedRoles: [USER_ROLES.all]
            }
        })
     }
]);
