package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class LearningSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(LearningSpringApplication.class, args);
	}
	@GetMapping
public List<Student> hello(){
		return List.of(
				new Student(1L,"Mariam",15 ,LocalDate.of(1998, Month.JANUARY,1),"f")
		);
}

}
