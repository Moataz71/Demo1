package com.example.setrack.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoRepository extends CrudRepository<Demo, Long> {
    List<Demo> findAll();
    Demo findById(long id);
    Demo findByName(String name);

}
