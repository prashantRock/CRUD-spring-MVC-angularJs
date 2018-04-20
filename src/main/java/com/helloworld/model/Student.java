package com.helloworld.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.helloworld.util.StudentCO;

@Entity
public class Student {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	 
	    private String fname;
	    
	    private String lname;
	    
	    private String emailId;
	    
	    private String uniqueId;

	    public Student() {}
	    
	    public Student(StudentCO studentCO) {
	    	this.fname = studentCO.getFirstName();
	    	this.lname = studentCO.getLastName();
	    	this.emailId = studentCO.getEmailId();
	    	this.uniqueId = UUID.randomUUID().toString();
	    }
	    
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
}
