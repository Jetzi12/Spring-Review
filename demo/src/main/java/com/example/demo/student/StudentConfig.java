package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(1L,
                    "Mariam",

                    LocalDate.of(1998, Month.JANUARY,1),
                    "f"
            );
            Student alex = new Student(2L,
                    "Alex",

                    LocalDate.of(1998, Month.JANUARY,1),
                    "f"
            );
            repository.saveAll(List.of(mariam,alex));
        };
    }
}
