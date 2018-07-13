package com.avenuecode.webfluxapp.services;

import com.avenuecode.webfluxapp.domain.Person;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonService {

    Mono<Person> findById(String id);

    Flux<Person> findAll();

    Mono<Person> save(Mono<Person> personMono);

    Mono<Person> update(Person person);

    Mono<Void> deleteById(String id);
}
