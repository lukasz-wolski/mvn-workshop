function CalculatorController($scope) {

    $scope.calculate = function() {
        $scope.result = $scope.left + $scope.right
    }

}