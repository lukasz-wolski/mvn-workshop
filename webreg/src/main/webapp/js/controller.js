function UserRegController($scope, $http) {

    $scope.users = [
        {
            name: "Paweł",
            surname: "Stawicki",
            email: "pawelstawicki@gmail.com",
            webpage: "pawelstawicki.blogspot.com"
        },
        {
            name: "Leszek",
            surname: "Gruchała",
            email: "leszek@gmail.com",
            webpage: "leszek.blogspot.com"
        }
    ];

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
            }).error(function() {
                alert("error")
            })
    }

}