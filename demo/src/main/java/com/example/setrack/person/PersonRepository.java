package com.example.setrack.person;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PersonRepository extends CrudRepository <Person, Long> {
    List<Person> findAll();
    Person findById(long id);



}
