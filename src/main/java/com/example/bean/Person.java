package com.example.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name" ,nullable = true,length = 20)
    private String name;

    @Column(name = "password",nullable = true,length = 20)
    private String password;

    @Column(name = "age", nullable = true,length = 10)
    private int age;

}
