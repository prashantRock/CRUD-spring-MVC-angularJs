package com.helloworld.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helloworld.model.People;

import com.helloworld.util.PeopleCO;


@Transactional
@Service
public class PeopleService {

	private SessionFactory sessionFactory;

	@Autowired
	public PeopleService(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public List<People> fetchStudentList() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from People").list();
	}

	public int createRecord(PeopleCO peopleCO) {
		People people = new People(peopleCO);
		getSession().save(people);
		getSession().close();
		return people.getId(); // TODO Auto-generated method stub
	}

	public void deleteRecord(People peopleToDelete) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(peopleToDelete);
		tx.commit();
		session.close();
		
	}
	
	public People getEntityByID(int id)
	{
		 Session session = null;
	       People people=null;
		try {
            session = sessionFactory.openSession();
            people  =  (People) session.get(People.class, id);
        } catch (Exception e) {
        }
		finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return people;
		/*
		for(People people : list)
		{
			if(people.getId()==id)
			{
				return people;
			}
		}
		return null;*/
	}

	public void updateRecord(People peopleToUpdate) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(peopleToUpdate);
		tx.commit();
		session.close();
		// TODO Auto-generated method stub
		
	}

	public People getEntityByIDtoUpdate(People people,String name,String age,String contact) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		people.setName(name);
		people.setAge(age);
		people.setContact(contact);
		session.update(people);
		tx.commit();
		session.close();
		return people;	
		// TODO Auto-generated method stub
		
	}

}
