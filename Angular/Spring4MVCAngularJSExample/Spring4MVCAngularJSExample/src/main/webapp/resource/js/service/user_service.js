'use strict';

angular.module('myApp').factory('UserService', ['$http', function($http){

    var REST_SERVICE_URI = '/Spring4MVCAngularJSExample/user/';
    var factory = {};
    
    factory.fetchAllUsers = (callBackData,error) => {
    	
    	$http.get(REST_SERVICE_URI)
		.then(function(responseSuccess){
			if (responseSuccess.status == '204') {
				error(responseSuccess.data);
			} else {
				callBackData(responseSuccess.data);
			}
		}, function(error){
			console.log('fetch data empty!');
			callBackData(error.statusText);
		}).catch(function(error){console.log('fetch data error!')});
    }
    factory.createUser = (user,responseData,errorData) => {
    	 $http.post(REST_SERVICE_URI, user)
    	 .then(function(response){
    		 responseData(response.data);
    	 }, function(error){
    		 console.error('Error while fetching Users');
    		 errorData(error.statusText)
    	 });
    }
    
    factory.updateUser = (user, id,responseData,errorData) => {
    	$http.put(REST_SERVICE_URI+id, user)
    	.then(function(response){
    		responseData(response.data);
    	}, function(error){
    		errorData(error.statusText);
    	});
    }
    factory.deleteUser = (id, responseData, errorData) => {
    	$http.delete(REST_SERVICE_URI+id)
    	.then(function(response){
    		responseData(response.data);
    	}, function(error){
    		errorData(error.statusText);
    	});
    }
    return factory;
}]);
