package com.example.controller;

import com.example.bean.Person;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/")
    public String add(@RequestBody Person person){
        personService.add(person);
        return "add-ok";
    }


    @PutMapping("/{id}")
    public String update(@RequestBody Person person,@PathVariable("id") Long id){
        person.setId(id);
        personService.update(person);
        return "update-ok";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id){
        personService.delete(id);
        return "delete-ok";
    }

    @GetMapping("/{id}")
    public Person findOne(@PathVariable("id") Long id){
        return personService.findOne(id);
    }

    @GetMapping("/")
    public List<Person> findAll(){
        return  personService.findAll();
    }

    @GetMapping("/name/{name}")
    public Person findByNameEquals(@PathVariable("name") String name){

        return personService.findByNameEquals(name);
    }

    @GetMapping("/namelike/{name}")
    public List<Person> findByNameLike(@PathVariable("name") String name){
        return  personService.findByNameLike(name);
    }


    @GetMapping("/login/{name}/{password}")
    public Person findByNameEqualsAndPasswordEquals(@PathVariable("name") String name,@PathVariable("password") String password){
        return personService.findByNameEqualsAndPasswordEquals(name, password);
    }


    @GetMapping("/logins/{name}/{password}")
    public Person login(@PathVariable("name") String name,@PathVariable("password") String password){
        return personService.login(name, password);
    }


    @GetMapping("/password/")
    public List<Person> findByPasswordLength(){
        return personService.findByPasswordLength();
    }




}
