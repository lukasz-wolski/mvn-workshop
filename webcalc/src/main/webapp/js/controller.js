function CalculatorController($scope) {

    $scope.calculate = function() {
        $scope.result = parseFloat($scope.left) + parseFloat($scope.right)
    }

}