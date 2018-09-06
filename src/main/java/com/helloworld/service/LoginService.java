package com.helloworld.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.helloworld.model.People;
import com.helloworld.util.PeopleCO;

@Transactional
@Service
public class LoginService {
	
	public HibernateTemplate hibernateTemplate;
	SessionFactory sessionFactory;
	
	@Autowired
	public LoginService(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}
	
	 public LoginService() { 
		
	}
	
	    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	
	        this.hibernateTemplate = hibernateTemplate;
	
	    }


	public boolean findUser(String name, String age) {
		// TODO Auto-generated method stub
		boolean isValidUser=false;
		String sqlQuery="from People p where p.name=? and p.age=?";
		
		List user =  getSession().createQuery(sqlQuery)
				.setString(0, name)
				.setParameter(1, age)
				.list();
				System.out.println(name+"=====================================");
				System.out.println(name+"=====================================");
				System.out.println(name+"=====================================");
				System.out.println(name+"=====================================");
			if((user!=null)&&(user.size()>0))
			{
				isValidUser=true;
			}
			else
			{
				isValidUser=false;
			}

		
		return isValidUser;
	}

	public boolean loginUser(PeopleCO peopleCO) {
		People people=new People(peopleCO);
		String name=people.getName();
		String age=people.getAge();
		boolean is_valid=findUser(name,age);// TODO Auto-generated method stub
		return is_valid;
	}

}
