package com.faith.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.model.EmployeeVisit;
import com.faith.app.service.IEmployeeVisitService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class EmployeeVisitController {
	@Autowired
	private IEmployeeVisitService visitService;
	
	@GetMapping("/visits")
	public List<EmployeeVisit> getAllVisits() {
		return (List<EmployeeVisit>) visitService.getAllVisits();
	}

	@GetMapping("/visits/{id}")
	public Optional<EmployeeVisit> getVisitById(@PathVariable Integer id) {
		return visitService.getVisitById(id);
	}

	@PostMapping("/visits")
	public void addVisit(@RequestBody EmployeeVisit visit) {
		visitService.addVisit(visit);

	}

	@PutMapping("/visits")
	public void updateEmployee(@RequestBody EmployeeVisit visit) {
		visitService.updateVisit(visit);

	}

	@DeleteMapping("/visits/{id}")
	public void deleteVisit(@PathVariable Integer id) {
		visitService.deleteVisit(id);
	}


}
