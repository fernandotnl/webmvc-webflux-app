package com.avenuecode.webmvcapp.repositories;

import com.avenuecode.webmvcapp.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
}
