package com.sphere.compentencytool.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sphere.compentencytool.model.User;
import com.sphere.compentencytool.repository.UserRepository;




@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	UserRepository userRepository;
	
	
	@GetMapping("test")
	public String Test(){
		
		return "Api working ";	
	}
		
	@GetMapping("user")
	public List<User> getAllUser(){
		return this.userRepository.findAll();
	}
	
	
	@PostMapping(value = "/user", produces = "application/json")
   public User createUser(@RequestBody User user) {
		System.out.println("user api rquest :"+user);
	return this.userRepository.save(user);
   }	
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateTutorial(@PathVariable("id") long id, @RequestBody User user) {
		Optional<User> userData = userRepository.findById(id);

		if (userData.isPresent()) {
			User _user = userData.get();
			_user.setName(user.getName());
			_user.setEmail(user.getEmail());
			_user.setPhone_num(user.getPhone_num());
			return new ResponseEntity<>(userRepository.save(_user), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
		try {
			userRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}	

