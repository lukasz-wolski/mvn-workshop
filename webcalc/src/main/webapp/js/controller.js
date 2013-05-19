function CalculatorController($scope, $http) {

    $scope.calculate = function() {
        $http.get('rest/calculator',
            {
                params: {
                    left: $scope.left,
                    right: $scope.right
                }
            }).success(function(response) {
                $scope.result = response
            });
    }

}