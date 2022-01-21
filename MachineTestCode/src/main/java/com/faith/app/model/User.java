package com.faith.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// declaring variables
	private int id;
	private String username;
	private String password;
	private String userType;

	// one - one mapping
	@OneToOne(mappedBy = "User", cascade = CascadeType.ALL)
	private Employee employee;

	// default constructor
	public User() {
		super();
	}

	// parameterized constructor
	public User(int id, String username, String password, String userType, Employee employee) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.employee = employee;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	// Generate toString
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", userType=" + userType
				+ ", employee=" + employee + "]";
	}

}
