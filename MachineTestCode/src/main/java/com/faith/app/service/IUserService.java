package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.model.User;


public interface IUserService {
	
	public List<User> getAllUsers();

	public Optional<User> getUserById(Integer id);

	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(Integer id);
	
	public User getUserByUserNameAndPassword(String username,String password);

}
