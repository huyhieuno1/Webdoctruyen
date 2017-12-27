/**
 * 
 */
package com.fpt.fresher.springmvc.service;

import java.util.List;

import com.fpt.fresher.springmvc.model.TbStudent;
/**
 * @author hungxoan
 *
 */
public interface ITbStudentService {
	
 List<TbStudent> listAllStudent();
 
 boolean addStudents(TbStudent student);
 boolean deleteStudent(TbStudent student);
 
 TbStudent findById(long id);
 
}
