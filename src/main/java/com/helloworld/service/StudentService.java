package com.helloworld.service;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.helloworld.model.Student;
import com.helloworld.util.StudentCO;

@Transactional
@Service
public class StudentService {
	
	private SessionFactory sessionFactory;

	@Autowired
	public StudentService(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}
	
	public int createStudent(StudentCO studentCO) {
		Student student = new Student(studentCO);
		getSession().save(student);
		getSession().close();
		return student.getId();
	}
	
	public List<Student> fetchStudentList() {
		 return sessionFactory.getCurrentSession().createQuery("from Student")
	                .list();
	}
	
}