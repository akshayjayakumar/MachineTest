package com.faith.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// declaring variables
	private int empId;
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private String address;
	private int id;

	// mapping
	// One - One mapping
	@OneToOne
	@JoinColumn(name = "id", insertable = false, updatable = false)
	private User user;

	// One - Many mapping
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<EmployeeVisit> employeevisits;

	// default constructor
	public Employee() {
		super();
	}

	// parameterized constructor
	public Employee(int empId, String firstName, String lastName, String gender, int age, String address, int id,
			User user, List<EmployeeVisit> employeevisits) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.id = id;
		this.user = user;
		this.employeevisits = employeevisits;
	}

	// getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@JsonBackReference
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@JsonManagedReference
	public List<EmployeeVisit> getEmployeevisits() {
		return employeevisits;
	}

	public void setEmployeevisits(List<EmployeeVisit> employeevisits) {
		this.employeevisits = employeevisits;
	}

	// Generates toString
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", age=" + age + ", address=" + address + ", id=" + id + ", user=" + user + ", employeevisits="
				+ employeevisits + "]";
	}

}
