 package com.vitor.course.recources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitor.course.entities.User;

@RestController
@RequestMapping(value = "/users")// Quando acessar o caminho /users no navegador
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Vitor", "vitor@gmail.com", "9999999", "1234");
		
		return ResponseEntity.ok().body(u);
	}
}
