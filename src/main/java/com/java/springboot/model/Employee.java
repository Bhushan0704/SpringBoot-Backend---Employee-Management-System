package com.java.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Getters and Setters play an important role in retrieving and updating the value of a variable outside the encapsulating class.
// Accessing Variables Without Getters and Setters
// 1 - First, for accessing the variables outside a class without getters/setters, we have to mark those as public, protected, or default. 
// 2 - Thus, we're losing control over the data and compromising the fundamental OOP principle – encapsulation.

@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String FirstName;
	
	@Column(name = "last_name")
	private String LastName;
	
	@Column(name = "email_id")
	private String EmailId;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId) {
	super();
	FirstName = firstName;
	LastName = lastName;
	EmailId = emailId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	//Getter method return its value
	public String getFirstName() {
		return FirstName;
	}
	//Setter method sets and updates the value
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
}
