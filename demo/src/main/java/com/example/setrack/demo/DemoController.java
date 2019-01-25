package com.example.setrack.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class DemoController {

    @Autowired
    private DemoRepository demoRepository;


    @RequestMapping(value = "/get-demos", method = RequestMethod.GET)
    public List<Demo> getAll(){
        //response entity

        return demoRepository.findAll();
    }

    @RequestMapping(value = "/find-one", method = RequestMethod.GET)
    public Demo getOne(@RequestParam long id){
        return demoRepository.findById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces="application/json", consumes="application/json")
    public void saveDemo(@RequestBody Demo demo){
        System.out.println(demo.getName());
        demoRepository.save(demo);

        //demoRepository.save(demo);
    }

    @RequestMapping(value= "/delete", method = RequestMethod.DELETE)
    public void deleteDemo(@RequestParam long id){
        demoRepository.deleteById(id);
    }
}
