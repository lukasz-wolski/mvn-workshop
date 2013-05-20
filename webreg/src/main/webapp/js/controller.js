function UserRegController($scope, $http) {

    $scope.updateUsers = function() {
        $http.get('rest/storage/users')
            .success(function(response) {
                $scope.users = response
            })
    }

    $scope.registerUser = function() {
        $http.post('rest/storage/store',
            $.param({
                name: $scope.name,
                surname: $scope.surname,
                email: $scope.email,
                webpage: $scope.webpage
            }),
            {
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function() {
                alert("success, user added")
                $scope.updateUsers()
            }).error(function() {
                alert("error")
            })
    }

    $scope.updateUsers()
}
