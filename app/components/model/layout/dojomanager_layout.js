

catwalkApp.config(['$stateProvider', '$urlRouterProvider',
    function ($stateProvider, $urlRouterProvider) {
        $stateProvider
        .state('dojomanager', {
            abstract: false,
            url: "/dojomanager",
            templateUrl: "components/model/layout/dojomanager_layout.html"
        })

     }
]);
