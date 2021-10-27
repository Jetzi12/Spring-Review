package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "Student_sequence",
            sequenceName = "Student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private LocalDate birth;
    private String email;
    @Transient
    private Integer age;
    public Student() {
    }

    public Student(Long id, String name, LocalDate birth, String email) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.email = email;
    }

    public Student(String name, LocalDate birth, String email) {
        this.name = name;
        this.birth = birth;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public Integer getAge() {
        return Period.between(birth,LocalDate.now()).getYears();
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

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
