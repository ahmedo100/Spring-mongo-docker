package com.cartoflow.cartoflowspring;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloRessource {
    @Autowired
    private UserRepository repository;

	@GetMapping("/users/")
	public String usersFirstName(@RequestParam String firstName) {
        User usr = repository.findUserByFirstName(firstName);
        
        return usr.toString();
    }
    
  
}