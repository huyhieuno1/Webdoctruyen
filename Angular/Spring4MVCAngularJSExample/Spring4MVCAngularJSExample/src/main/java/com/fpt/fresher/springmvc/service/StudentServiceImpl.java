/**
 * 
 */
package com.fpt.fresher.springmvc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.fpt.fresher.springmvc.model.Student;

/**
 * @author hungxoan
 *
 */
@Service("iStudentService")
public class StudentServiceImpl implements IStudentService {

	private static final AtomicLong counter = new AtomicLong();
	
	private static List<Student> lstStudent;

	static{
		lstStudent= populateDummyStudent();
	}
	
	@Override
	public List<Student> findAllStudent() {
		
		return lstStudent;
	}

	@Override
	public Student findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findByName(String name) {
		for(Student student : lstStudent){
			if(student.getUsername().equalsIgnoreCase(name)){
				return student;
			}
		}
		return null;
	}

	@Override
	public void saveStudent(Student student) {
		student.setId(counter.incrementAndGet());
		lstStudent.add(student);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isStudentExist(Student student) {
		return findByName(student.getUsername())!=null;
	}
//	private static List<Student> populateDummyStudent(){
//		List<Student> lstStudent = new ArrayList<Student>();
//		lstStudent.add(new Student(1,"Long"));
//		lstStudent.add(new Student(2,"Linh"));
//		lstStudent.add(new Student(3,"Minh"));
//		lstStudent.add(new Student(4,"Hung", 8.5, 8.5, 10));
//		return lstStudent;
//	}
	private static List<Student> populateDummyStudent(){
		List<Student> lstStudent = new ArrayList<Student>();
		lstStudent.add(new Student(1,"Long", "Chuyên Hóa", 5.5, 6.5, 7.5));
		lstStudent.add(new Student(2,"Linh","Chuyên Toán", 6.0, 9.0, 7.5));
		lstStudent.add(new Student(3,"Minh","Chuyên Anh", 3.5, 5.0, 6.5));
		lstStudent.add(new Student(4,"Hung","Chuyên Tin", 8.5, 8.5, 10));
		return lstStudent;
	}

}
