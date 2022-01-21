package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.Employee;
import com.faith.app.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImplementation implements IEmployeeService {

	@Autowired
	private IEmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer id) {
		return employeeRepository.findById(id);
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);

	}

}
