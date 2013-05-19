function UserRegController($scope) {

    $scope.registerUser = function() {
        alert($scope.name + " " + $scope.email)
    }

}