package com.faith.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class EmployeeVisit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// declaring variables
	private int vId;
	private String customerName;
	private String contactPerson;
	private String interestedProduct;
	private String visitSubject;
	private boolean isDisabled;
	private boolean isDeleted;
	private int empId;

	// mapping
	// Many - One
	@ManyToOne
	@JoinColumn(name = "empId", insertable = false, updatable = false)
	private Employee employee;

	// default constructor
	public EmployeeVisit() {
		super();
	}

	// parameterized constructor
	public EmployeeVisit(int vId, String customerName, String contactPerson, String interestedProduct,
			String visitSubject, boolean isDisabled, boolean isDeleted, int empId, Employee employee) {
		super();
		this.vId = vId;
		this.customerName = customerName;
		this.contactPerson = contactPerson;
		this.interestedProduct = interestedProduct;
		this.visitSubject = visitSubject;
		this.isDisabled = isDisabled;
		this.isDeleted = isDeleted;
		this.empId = empId;
		this.employee = employee;
	}

	// getters and setters
	public int getvId() {
		return vId;
	}

	public void setvId(int vId) {
		this.vId = vId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getInterestedProduct() {
		return interestedProduct;
	}

	public void setInterestedProduct(String interestedProduct) {
		this.interestedProduct = interestedProduct;
	}

	public String getVisitSubject() {
		return visitSubject;
	}

	public void setVisitSubject(String visitSubject) {
		this.visitSubject = visitSubject;
	}

	public boolean isDisabled() {
		return isDisabled;
	}

	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@JsonBackReference
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	// Generate toString
	@Override
	public String toString() {
		return "EmployeeVisit [vId=" + vId + ", customerName=" + customerName + ", contactPerson=" + contactPerson
				+ ", interestedProduct=" + interestedProduct + ", visitSubject=" + visitSubject + ", isDisabled="
				+ isDisabled + ", isDeleted=" + isDeleted + ", empId=" + empId + ", employee=" + employee + "]";
	}

}
