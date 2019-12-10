package com.app.api.interfaces;

import java.util.List;

import com.app.api.models.Person;

public interface IPerson {
	
	public List<Person> getPersons();
	
	public Person getPetson(int id);
	
	public Person addPerson(Person p);
	
	public void deletePerson(int id);
 	

}
