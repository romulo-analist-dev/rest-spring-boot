package com.romulo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romulo.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{}
