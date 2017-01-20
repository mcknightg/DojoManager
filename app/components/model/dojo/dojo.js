'use strict';

//  Dojomanager Dojo Controller
catwalkApp.controller('DojomanagerDojoController', ['$scope','$location','$stateParams','$global.services', 'DojomanagerDojo',
    function ($scope,location,$stateParams,$services, service) {
        $scope.name = "Dojo";
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
            location.path('/dojomanager/dojo/');
        };

        $scope.update= function(id){
            location.path('/dojomanager/dojo/' + id);
        };

        $scope.back = function () {
            window.history.back();
        };

        if($stateParams.id){ $scope.get($stateParams.id);}
        else{ $scope.list();}
    }
]);

//  Dojomanager Dojo Routing
catwalkApp.config(['$stateProvider', '$urlRouterProvider','USER_ROLES',
    function ($stateProvider, $urlRouterProvider, USER_ROLES) {
        $stateProvider
        .state('dojomanager.dojo', {
            url: "/dojo",
            templateUrl: "components/model/dojo/dojoTable.html",
            controller: 'DojomanagerDojoController',
            access: {
                authorizedRoles: [USER_ROLES.all]
            }
        })
        .state('dojomanager.dojoForm', {
            url: "/dojo/:id",
            templateUrl: "components/model/dojo/dojoForm.html",
            controller: 'DojomanagerDojoController',
            access: {
                authorizedRoles: [USER_ROLES.all]
            }
        })
     }
]);
