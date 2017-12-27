/**
 * 
 */
'use strict';
angular.module('myApp').controller('StudentController', ['$scope', 'StudentService', function($scope, StudentService) {
	
	fetchAllStudents();
	$scope.lstStudent = [];
//	$scope.student = {
//			id:null,
//			username: "Xoanlovely",
//			address: "Thai Binh",
//			email: "hungpv@gmail.com",
//			classname : "Công nghệ Phần Mềm",
//			diemtoan: 9,
//			diemly: 9,
//			diemhoa: 10
//	}
	
	function resetInput() {
		
		$scope.student = {
				id:null,
				username: "",
				address: "",
				email: "",
				classname : "",
				diemtoan: 0,
				diemly: 0,
				diemhoa: 0
		}
	}
	
	
	function fetchAllStudents(){
		debugger;
		console.log($scope.student);
		StudentService.fetchAllStudent(function(response){
			debugger;
			console.log(typeof response[0].diemtoan);
			$scope.lstStudent = response;
			
		});
		
	}
	
    function createStudent(student){
    	StudentService.createStudent(student,function(response){
    		fetchAllStudents();
    		resetInput();
    	}, function(error){
    		console.log('Error while creating student');
    	});
    }
    
    $scope.submit = function(student){
    	console.log('Demo');
        if(student.id===null || student.id == undefined){
            //console.log('Saving New student', student);
            createStudent(student);
        }else{
        	createStudent(student);
            console.log('student updated with id ', student.id);
        }
    }
    
    $scope.edit = (id) => {
        console.log('id to be edited', id);
        for(var i = 0; i < $scope.lstStudent.length; i++){
            if($scope.lstStudent[i].id === id) {
            	$scope.student = angular.copy($scope.lstStudent[i]);
                break;
            }
        }
    }
    
    $scope.remove = (id) => {
    	console.log('test');
    	var lstStudent = $scope.lstStudent.filter(item => item.id == id);
    	
    	StudentService.removeStudent(lstStudent[0],function(response){
    		console.log('Remove Success Student: ',lstStudent[0].username);
    		fetchAllStudents();
    	}, function(error){
    		console.log('Remove error: ', lstStudent[0].username);
    	});
    	
    }
    
}]);