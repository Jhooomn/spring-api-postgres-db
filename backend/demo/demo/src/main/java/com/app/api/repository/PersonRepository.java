package com.app.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.api.models.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
