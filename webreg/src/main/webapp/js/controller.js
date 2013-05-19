function UserRegController($scope) {

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
        alert($scope.name + " " + $scope.email)
    }

}