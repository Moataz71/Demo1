package com.example.setrack.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MoatazController {

    @Autowired
    private MoatazRepository moatazRepository;


    @RequestMapping(value = "/get-moatazs", method = RequestMethod.GET)
    public List<Moataz> getAll(){
        return moatazRepository.findAll();
    }


    @RequestMapping(value = "/find-one1", method = RequestMethod.GET)
    public Moataz getOne(@RequestParam long id){
        return moatazRepository.findById(id);
    }


    @RequestMapping(value = "/save1", method = RequestMethod.POST)
    public void saveMoataz(@RequestBody Moataz moataz){
        Moataz m = new Moataz();
        m.setName(moataz.getName());
        m.setId(moataz.getId());
        moatazRepository.save(m);
    }

    @RequestMapping(value= "/delete1", method = RequestMethod.DELETE)
    public void deleteMoataz(@RequestParam long id){
        moatazRepository.deleteById(id);
    }



}
