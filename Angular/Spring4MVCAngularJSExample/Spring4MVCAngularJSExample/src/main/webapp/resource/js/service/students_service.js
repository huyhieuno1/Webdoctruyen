/**
 * 
 */

'use strict';

angular.module('myApp').factory('StudentService', ['$http', function($http){
	
		var REST_SERVICE_URI = '/Spring4MVCAngularJSExample/student/';
		
		var factory = {};
	
		factory.fetchAllStudent = (callbackData,error) => { 
			$http.get(REST_SERVICE_URI)
			.then(function(responseSuccess){
						if (responseSuccess.status == '204') {
							console.log('Fetch student error!');
							error(responseSuccess.data)
						} else {
							callbackData(responseSuccess.data);
						}
				}).catch(function(error){console.log('fetch data error!')});
		}
		
		factory.createStudent = (student,responseData,errorData) => {
			 
			$http.post(REST_SERVICE_URI, student)
	    	 .then(function(response){
	    		 responseData(response.data);
	    	 }, function(error){
	    		 console.error('Error while fetching Users');
	    		 errorData(error.statusText)
	    	 });
	    }
		
		factory.removeStudent = (student,responseData,errorData) => {
			$http.post(REST_SERVICE_URI + 'delete-student/', student)
	    	 .then(function(response){
	    		 responseData(response.data);
	    	 }, function(error){
	    		 console.error('Error while fetching Users');
	    		 errorData(error.statusText)
	    	 });
	    }
		
		return factory;
}]);