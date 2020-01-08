package com.example.dao;

import com.example.bean.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonDao extends JpaRepository<Person,Long> {
    /**
     * 使用 JPA 按照规定的接口命名方法来实现自 动化查询
     */


    //查询指定用户姓名的用户
    public Person findByNameEquals(String name);


    //查询指定用户姓名和密码都相同的用户
    public Person findByNameEqualsAndPasswordEquals(String name,String password);


    //模糊查询包含指定名字的用户
    public List<Person> findByNameLike(String name);


    //自定义方法  查询指定用户姓名和密码都相同的用户
    @Query("select p from Person p where p.name=:name and p.password=:password")
    public Person login(@Param("name") String name,@Param("password") String password);


    //根据密码长度查询用户
    @Query(value = "select * from person where length(password)=4 ",nativeQuery = true)
    public List<Person> findByPasswordLength();
}













