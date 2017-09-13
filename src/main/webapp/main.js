/**
 * Created by Administrator on 2017/9/4 0004.
 */

angular.module("testApp", ["ngDraggable"]).controller("testController", ["$scope", function ($scope) {
        console.log("test controller");

        $scope.test = "test";

        $.ajax("i18n/test.json", {async:false}).success(function (data) {

            $scope.data = data.dataList;
            console.log($scope.data);
        });

        $scope.test1 = function () {
            alert(123);
        }

    $scope.dropComplete = function(index, obj){
        var idx = $scope.data.indexOf(obj);
        $scope.data[idx] = $scope.data[index];
        $scope.data[index] = obj;
    };

    }]);



