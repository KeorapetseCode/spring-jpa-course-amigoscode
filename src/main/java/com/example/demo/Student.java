package com.example.demo;
import javax.persistence.Entity;
import  javax.persistence.Id;


@Entity
public class Student {
    @Id
    private Long id;
    private String first_name;
    private String surname;
    private String email;
    private Integer age;

    public Student(Long id, String first_name, String surname, String email, Integer age) {
        this.id = id;
        this.first_name = first_name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }
//-------------------------setter---------------------------------------------------------
    public void setId(Long id) {
        this.id = id;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
//---------------------getters---------------------------------------------------
    public Long getId() {
        return id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmail() {
        return email;
    }
    public Integer getAge() {
        return age;
    }
}