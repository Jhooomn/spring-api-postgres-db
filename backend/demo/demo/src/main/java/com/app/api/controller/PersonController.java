package com.app.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.api.models.Person;
import com.app.api.service.PersonService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
@RequestMapping("/u")
public class PersonController {

	@Autowired
	PersonService service;

	@GetMapping("/person")
	public List<Person> getPersons() {
		return service.getPersons();
	}

	@GetMapping("/person/{id}")
	public Person getPerson(@PathVariable int id) {
		return service.getPetson(id);
	}

	@PostMapping("/person")
	public Person addPerson(@RequestBody Person p) {
		return service.addPerson(p);
	}
	
	@PutMapping("/person")
	public Person updatePerson(@RequestBody Person p) {
		return service.addPerson(p);
	}

	@DeleteMapping("/person/{id}")
	public void deletePerson(@PathVariable int id) {
		service.deletePerson(id);
	}

}
