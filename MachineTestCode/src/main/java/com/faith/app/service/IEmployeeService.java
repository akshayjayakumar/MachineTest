package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.model.Employee;

public interface IEmployeeService {
	
	public List<Employee> getAllEmployees();

	public Optional<Employee> getEmployeeById(Integer id);

	public void addEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(Integer id);

}
