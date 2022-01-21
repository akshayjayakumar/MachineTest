package com.faith.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.model.EmployeeVisit;

@Repository
public interface IEmployeeVisitRepository extends CrudRepository<EmployeeVisit, Integer> {

}
