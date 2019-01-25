package com.example.setrack.demo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface MoatazRepository extends CrudRepository<Moataz, Long> {

    List<Moataz> findAll();
    Moataz findById(long id);
}

