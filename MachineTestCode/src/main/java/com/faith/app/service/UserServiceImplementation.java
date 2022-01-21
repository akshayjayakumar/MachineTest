package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.User;
import com.faith.app.repository.IUserRepository;
@Service
public class UserServiceImplementation implements IUserService {
	
	@Autowired
	private IUserRepository UserRepository;

	@Override
	public List<User> getAllUsers() {
		return (List<User>) UserRepository.findAll();
	}

	@Override
	public Optional<User> getUserById(Integer id) {
		return UserRepository.findById(id);
	}

	@Override
	public void addUser(User user) {
		UserRepository.save(user);

	}

	@Override
	public void updateUser(User user) {
		UserRepository.save(user);

	}

	@Override
	public void deleteUser(Integer id) {
		UserRepository.deleteById(id);

	}

	@Override
	public User getUserByUserNameAndPassword(String username, String password) {
		return UserRepository.findByUsernameAndPassword(username, password);
	}

}
