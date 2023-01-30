package com.capg.abms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.abms.entity.Users;
import com.capg.abms.exception.EmailNotFoundException;
import com.capg.abms.exception.InvalidPasswordException;
import com.capg.abms.exception.ResourceNotFoundException;
import com.capg.abms.repository.UsersRepository;

@RestController
@RequestMapping("/api")
public class UsersController {

	@Autowired
	private UsersRepository usersRepository;

	@GetMapping("/user")
	public List<Users> getAllUsers() {
		return usersRepository.findAll();
	}
	
	/*
	@PostMapping("/user")
	public  Users isUsersPresent(@RequestBody Users users ) throws InvalidUserException{
		users.getEmail();
		if(!usersRepository.findbyEmail().equals(users.getEmail())){
			throw new UserNotFoundException("Enter correct username!");
		}

		return users;

	} 
	
	*/

	@PostMapping("/user")
	public Users createUsers(@RequestBody Users users) throws InvalidPasswordException {
		users.getEmail();
		if (!users.getPassword().equals(users.getConfirmPassword())) {
			throw new InvalidPasswordException("Enter Same Password!");
		}

		return usersRepository.save(users);

	}

	
	
//   made changes from here
  /*
   @PostMapping("/user/{email,password}")
   public ResponseEntity<Users> getUserByEmailPassword(@Pathvariable value = "email") Long userEmail  throws EmailNotFoundException {

		Users users = usersRepository.findByEmail(UserEmail) && (@Pathvariable value = "password") 
	
	*/
	
//  made chenges till here

	
	
	
	@GetMapping("/user/{id}")
	public ResponseEntity<Users> getUserById(@PathVariable(value = "id") Long userId) throws ResourceNotFoundException {

		Users users = usersRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Users id is not found"));

		return ResponseEntity.ok().body(users);

	}

	@GetMapping("/user/by/{email}")
	public ResponseEntity<Users> getUserByEmail(@PathVariable(value = "email") String UserEmail) throws EmailNotFoundException {

		Users users = usersRepository.findByEmail(UserEmail)/* .orElseThrow(()->new EmailNotFoundException("Users id is not found")) */;
		if (users == null) {
			throw new EmailNotFoundException("Users id is not found");
		}

		return ResponseEntity.ok().body(users);

	}

}
