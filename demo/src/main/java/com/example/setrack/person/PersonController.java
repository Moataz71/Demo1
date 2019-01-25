package com.example.setrack.person;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController

public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping(value = "/get-persons", method = RequestMethod.GET)
    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    @RequestMapping(value = "/add-person", method = RequestMethod.POST , consumes="application/json")
    public void savePerson(@RequestBody Person person){
        personRepository.save(person);

    }

    @RequestMapping(value = "/edit-person", method = RequestMethod.POST , consumes="application/json")
    public void editPerson(@RequestBody Person person){
        Person p = personRepository.findById(person.getId());
        p.setName(person.getName());
        p.setAge(person.getAge());
        personRepository.save(p);

    }

    @RequestMapping(value = "/delete-person", method = RequestMethod.DELETE , consumes="application/json")
    public void deletePerson(@RequestBody Person person){
        personRepository.deleteById(person.getId());

    }


}
