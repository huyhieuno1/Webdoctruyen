
angular.module('hello').controller('HelloController', ['$scope', 'HelloService', function($scope, HelloService) {
	
	helloo();
	$scope.he = [];
	function helloo(){
		HelloService.helloxx(function (response){
			debugger;
			$scope.he = response;	
			console.log(response);
		});
	}
    
}]);