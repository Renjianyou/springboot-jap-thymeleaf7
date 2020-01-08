package com.example.service;

import com.example.bean.Person;

import java.util.List;

public interface PersonService {
    public void add(Person person);


    public void update(Person person);


    public void delete(Long id);


    public Person findOne(Long id);


    public List<Person> findAll();


    public Person findByNameEquals(String name);


    public Person findByNameEqualsAndPasswordEquals(String name,String password);

    public List<Person> findByNameLike(String name);


    public Person login(String name,String password);



    public List<Person> findByPasswordLength();
}
