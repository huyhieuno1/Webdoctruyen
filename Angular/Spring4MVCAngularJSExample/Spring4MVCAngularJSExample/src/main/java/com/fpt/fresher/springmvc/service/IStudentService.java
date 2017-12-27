/**
 * 
 */
package com.fpt.fresher.springmvc.service;

import java.util.List;

import com.fpt.fresher.springmvc.model.Student;

/**
 * @author hungxoan
 *
 */
public interface IStudentService {
	List<Student> findAllStudent(); 
	Student findById(long id);
	
	Student findByName(String name);
	
	void saveStudent(Student student);
	
	void updateStudent(Student student);
	
	void deleteStudent(long id);
	
	boolean isStudentExist(Student student);
}
