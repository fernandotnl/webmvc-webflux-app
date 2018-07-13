package com.avenuecode.webfluxapp.controllers;

import com.avenuecode.webfluxapp.domain.Person;
import com.avenuecode.webfluxapp.services.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/api/v1/persons/{id}")
    public Mono<Person> findById(@PathVariable String id){
        return this.personService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/api/v1/persons")
    public Flux<Person> findAll(){
        return this.personService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/api/v1/persons")
    public Mono<Person> save(@RequestBody Mono<Person> personMono){
        return this.personService.save(personMono);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/api/v1/persons/{id}")
    public Mono<Person> update(@PathVariable String id, @RequestBody Person person){
        person.setId(id);
        return this.personService.update(person);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/api/v1/persons/{id}")
    public Mono<Void> deleteById(@PathVariable String id){
        return this.personService.deleteById(id);
    }
}
