package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.model.EmployeeVisit;

public interface IEmployeeVisitService {
	
	public List<EmployeeVisit> getAllVisits();

	public Optional<EmployeeVisit> getVisitById(Integer id);

	public void addVisit(EmployeeVisit visit);

	public void updateVisit(EmployeeVisit visit);

	public void deleteVisit(Integer id);

}
