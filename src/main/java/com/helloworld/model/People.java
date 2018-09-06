package com.helloworld.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.helloworld.util.PeopleCO;
import com.helloworld.util.StudentCO;

@Entity
public class People {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	 
	    private String name;
	    
	    private String age;
	    
	    private String contact;
	    
	    private String uniqueId;

	    public People() {}
	    
	    public People(PeopleCO studentCO) {
	    	this.name = studentCO.getName();
	    	this.age = studentCO.getAge();
	    	this.contact = studentCO.getContact();
	    	this.uniqueId = UUID.randomUUID().toString();
	    }
	    
	    public String getUniqueId()
	    {
	    	return uniqueId;
	    }
	    public void setUniqueId(String uniqueId)
	    {
	    	this.uniqueId=uniqueId;
	    }
	    
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}
}
