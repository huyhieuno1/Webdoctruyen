angular.module('hello').factory('HelloService', ['$http', function($http){
	
		var REST_SERVICE_URI = '/DemoAngularHelloWorld/helloo/';
		
		var factory = {};
	
		factory.helloxx = (callbackData,error) => { 
			$http.get(REST_SERVICE_URI)
			.then(function(responseSuccess){
					callbackData(responseSuccess.data);
				}).catch(function(error){console.log('fetch data error!')});
		}
		return factory;
}]);