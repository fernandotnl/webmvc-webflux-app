package com.avenuecode.webfluxapp.repositories;

import com.avenuecode.webfluxapp.domain.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends ReactiveMongoRepository<Person, String> {
}
