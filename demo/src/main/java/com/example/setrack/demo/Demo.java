package com.example.setrack.demo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "Demo")
public class Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Access(AccessType.PROPERTY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
