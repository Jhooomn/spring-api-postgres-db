package com.app.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.api.interfaces.IPerson;
import com.app.api.models.Person;
import com.app.api.repository.PersonRepository;

@Service
public class PersonService implements IPerson{
	
	@Autowired
	PersonRepository repo;

	@Override
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Person getPetson(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Person addPerson(Person p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public void deletePerson(int id) {
		repo.deleteById(id);
	}

}
