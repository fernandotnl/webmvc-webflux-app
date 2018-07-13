package com.avenuecode.webfluxapp.services;

import com.avenuecode.webfluxapp.domain.Person;
import com.avenuecode.webfluxapp.repositories.PersonRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @Override
    public Mono<Person> findById(String id) {
        return this.personRepository.findById(id);
    }

    @Override
    public Flux<Person> findAll() {
        return this.personRepository.findAll();
    }

    @Override
    public Mono<Person> save(Mono<Person> personMono) {
        return this.personRepository.save(personMono.block());
    }

    @Override
    public Mono<Person> update(Person person) {
        return this.personRepository.save(person);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return this.personRepository.deleteById(id);
    }
}
