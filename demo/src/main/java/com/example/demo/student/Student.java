package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private Integer age;
    private LocalDate birth;
    private String email;

    public Student() {
    }

    public Student(Long id, String name, Integer age, LocalDate birth, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.email = email;
    }

    public Student(String name, Integer age, LocalDate birth, String email) {
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
