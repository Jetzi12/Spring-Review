package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Service
public class StudentService {

    public List<Student> getStudent(){
        return List.of(
                new Student(1L,"Mariam",15 , LocalDate.of(1998, Month.JANUARY,1),"f")
        );
    }

}
