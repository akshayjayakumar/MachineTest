package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.EmployeeVisit;
import com.faith.app.repository.IEmployeeVisitRepository;
@Service
public class EmployeeVisitServiceImplementation implements IEmployeeVisitService {

	@Autowired
	private IEmployeeVisitRepository visitRepository;
	
	@Override
	public List<EmployeeVisit> getAllVisits() {
		return (List<EmployeeVisit>) visitRepository.findAll();
	}

	@Override
	public Optional<EmployeeVisit> getVisitById(Integer id) {
		return visitRepository.findById(id);
	}

	@Override
	public void addVisit(EmployeeVisit visit) {
		visitRepository.save(visit);
	}

	@Override
	public void updateVisit(EmployeeVisit visit) {
		visitRepository.save(visit);
	}

	@Override
	public void deleteVisit(Integer id) {
		visitRepository.deleteById(id);

	}

}
