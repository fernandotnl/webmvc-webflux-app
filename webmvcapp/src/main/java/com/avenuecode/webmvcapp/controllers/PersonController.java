package com.avenuecode.webmvcapp.controllers;

import com.avenuecode.webmvcapp.domain.Person;
import com.avenuecode.webmvcapp.services.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/api/v1/persons/{id}")
    public ResponseEntity<Person> findById(@PathVariable String id){
        return ResponseEntity.ok(this.personService.findById(id).orElse(null));
    }

    @GetMapping("/api/v1/persons")
    public ResponseEntity<List<Person>> findAll(){
        return ResponseEntity.ok(this.personService.findAll());
    }

    @PostMapping("/api/v1/persons")
    public ResponseEntity<Person> save(@RequestBody Person person){
        return ResponseEntity.ok(this.personService.save(person));
    }

    @PutMapping("/api/v1/persons/{id}")
    public ResponseEntity<Person> update(@PathVariable String id, @RequestBody Person person){
        person.setId(id);
        return ResponseEntity.ok(this.personService.update(person));
    }

    @DeleteMapping("/api/v1/persons/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id){
        this.personService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
