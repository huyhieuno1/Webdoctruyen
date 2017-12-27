/**
 * 
 */
package com.fpt.fresher.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.fpt.fresher.springmvc.model.TbStudent;
import com.fpt.fresher.springmvc.service.ITbStudentService;

/**
 * @author hungxoan
 *
 */
@RestController
public class StudentRestController {
	
	//@Autowired
	//IStudentService iStudentService;
	
	@Autowired
	ITbStudentService iTbStudentService;

	@RequestMapping(value = "/student/", method = RequestMethod.GET)
    public ResponseEntity<List<TbStudent>> listAllStudent() {
        List<TbStudent> lstStudent = iTbStudentService.listAllStudent();
    	
        if(lstStudent.isEmpty()){
            return new ResponseEntity<List<TbStudent>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<TbStudent>>(lstStudent, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/student/", method = RequestMethod.POST)
    public ResponseEntity<Void> createStudent(@RequestBody TbStudent student, UriComponentsBuilder ucBuilder) {
		
        System.out.println("Creating User " + student.getUsername());
 
//        if (iTbStudentService.findById(student.getId()) != null) {
//            System.out.println("A User with name " + student.getUsername() + " already exist");
//            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//        }

 
        iTbStudentService.addStudents(student);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/student/{id}").buildAndExpand(student.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
	
    @RequestMapping(value = "/student/delete-student/", method = RequestMethod.POST)
    public ResponseEntity<Void> deleteStudent(@RequestBody TbStudent student, UriComponentsBuilder ucBuilder) {
 
    	TbStudent st = iTbStudentService.findById(student.getId());
		if (st == null) {
			System.out.println("Unable to delete. User with id " + student.getUsername() + " not found");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
    	iTbStudentService.deleteStudent(student);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
