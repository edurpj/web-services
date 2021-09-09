package com.example.webServices.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webServices.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findall(){
		User u = new User(1L, "Edu", "edu@gmsail.com", "999999", "12345teste");
		return ResponseEntity.ok().body(u);
	}
}
