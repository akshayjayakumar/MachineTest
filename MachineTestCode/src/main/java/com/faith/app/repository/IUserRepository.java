package com.faith.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.faith.app.model.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer>{
	
	@Query("FROM Login WHERE username=?1 AND password=?2")
	User findByUsernameAndPassword(String username, String password);

}
