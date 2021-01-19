package com.igorjmv2000.gmail.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igorjmv2000.gmail.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Igor", "igorjmv2000@gmail.com", "(35) 99202-4518", "123456");
		return ResponseEntity.ok().body(u);
	}
}
