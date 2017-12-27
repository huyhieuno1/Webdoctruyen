package com.fpt.fresher.springmvc.service;
// Generated Dec 13, 2017 11:41:48 PM by Hibernate Tools 4.3.5.Final

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.fpt.fresher.springmvc.configuration.SessionFactoryUtils;
import com.fpt.fresher.springmvc.model.TbStudent;

/**
 * Home object for domain model class TbStudent.
 * @see com.fpt.fresher.springmvc.model.TbStudent
 * @author Hibernate Tools
 */
@Service("iTbStudentService")
public class TbStudentServiceImpl implements ITbStudentService{

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<TbStudent> listAllStudent() {
		Session session = SessionFactoryUtils.getSessionFactory().getCurrentSession();
		Transaction ts = session.beginTransaction(); 
		List<TbStudent> listStudent = (List<TbStudent>)
				session.createCriteria(TbStudent.class)
	                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
	                .list();
		ts.commit();
		return listStudent;
	}

	@Override
	@Transactional
	public boolean addStudents(TbStudent student) {
		Session session = SessionFactoryUtils.getSessionFactory().getCurrentSession();
		try {
			
			Transaction ts = session.beginTransaction(); 
			session.saveOrUpdate(student);
			ts.commit();
			return true;	
		} catch(Exception ex) {
			return false;
		}
	}

	@Override
	public boolean deleteStudent(TbStudent student) {
		Session session = SessionFactoryUtils.getSessionFactory().getCurrentSession();
		try {
			
			Transaction ts = session.beginTransaction(); 
			session.delete(student);
			ts.commit();
			return true;	
		} catch(Exception ex) {
			return false;
		}
	}

	@Override
	public TbStudent findById(long id) {
		Session session = SessionFactoryUtils.getSessionFactory().getCurrentSession();
		try {
			
			Transaction ts = session.beginTransaction(); 
			Query query = session.createQuery("from TbStudent where id = :msv ");
			query.setParameter("msv", id);
			
			TbStudent student = (TbStudent) query.uniqueResult();
			ts.commit();
			return student;	
		} catch(Exception ex) {
			return null;
		}
	}
}
