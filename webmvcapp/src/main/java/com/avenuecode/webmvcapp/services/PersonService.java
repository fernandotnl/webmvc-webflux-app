package com.avenuecode.webmvcapp.services;

import com.avenuecode.webmvcapp.domain.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Person findById(String id);

    List<Person> findAll();

    Person save(Person person);

    Person update(Person person);

    void deleteById(String id);
}
