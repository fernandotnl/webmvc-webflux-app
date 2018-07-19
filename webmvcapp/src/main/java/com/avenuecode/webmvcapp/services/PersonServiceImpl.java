package com.avenuecode.webmvcapp.services;

import com.avenuecode.webmvcapp.domain.Person;
import com.avenuecode.webmvcapp.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @Override
    public Person findById(String id) {
        return this.personRepository.findById(id).orElse(null);
    }

    @Override
    public List<Person> findAll() {
        return this.personRepository.findAll();
    }

    @Override
    public Person save(Person person) {
        return this.personRepository.save(person);
    }

    @Override
    public Person update(Person person) {
        return this.personRepository.save(person);
    }

    @Override
    public void deleteById(String id) {
        this.personRepository.deleteById(id);
    }
}
