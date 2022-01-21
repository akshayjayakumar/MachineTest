package com.faith.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.model.User;
import com.faith.app.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/logins")
	public List<User> getAllUsers() {
		return (List<User>) userService.getAllUsers();
	}

	@GetMapping("/logins/{id}")
	public Optional<User> getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);
	}

	@PostMapping("/logins")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);

	}

	@PutMapping("/logins")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);

	}

	@DeleteMapping("/logins/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);

	}

	@GetMapping("/login/{username}&{password}")
	public  ResponseEntity<User> getUserByUserNameAndPassword(@PathVariable String username,@PathVariable String password) {
		
		ResponseEntity<User> response=null;
		
		User login=userService.getUserByUserNameAndPassword(username, password);
		
		if(login==null) {
			response=new ResponseEntity<>(login,HttpStatus.NOT_FOUND);
		}
		else {
			response=new ResponseEntity<>(login,HttpStatus.OK);
		}
		return response;
	}


}
