package com.example.service.impl;

import com.example.bean.Person;
import com.example.dao.PersonDao;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {


    @Autowired
    PersonDao personDao;

    @Override
    public void add(Person person) {
        personDao.save(person);
    }

    @Override
    public void update(Person person) {
        personDao.saveAndFlush(person);
    }

    @Override
    public void delete(Long id) {
        personDao.deleteById(id);
    }

    @Override
    public Person findOne(Long id) {
        return personDao.findById(id).get();
    }

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }

    @Override
    public Person findByNameEquals(String name) {
        return personDao.findByNameEquals(name);
    }

    @Override
    public Person findByNameEqualsAndPasswordEquals(String name, String password) {
        return personDao.findByNameEqualsAndPasswordEquals(name, password);
    }

    @Override
    public List<Person> findByNameLike(String name) {
        return personDao.findByNameLike("%"+name+"%");
    }

    @Override
    public Person login(String name, String password) {
        return personDao.login(name, password);
    }

    @Override
    public List<Person> findByPasswordLength() {
        return personDao.findByPasswordLength();
    }
}
