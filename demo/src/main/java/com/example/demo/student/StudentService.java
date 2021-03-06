package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository
                .findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if(!exists) {
            throw new IllegalStateException("Student with that id" + studentId + " doesnt exist");
        } else {
            studentRepository.deleteById(studentId);
        }

    }
    @Transactional
    public void updateStudent(Long studentId, String name, String email) {
    Student student = studentRepository.findById(studentId).orElseThrow(() -> new IllegalStateException ("wrong id"));

        if (name != null && name.length() > 0 && !Objects.equals(name,student.getName())){
            student.setName(name);
        }

        if (email != null && email.length() > 0 && !Objects.equals(email,student.getEmail())){
            if (studentRepository.findStudentByEmail(email).isPresent()){
                throw new IllegalStateException("That address email is already taken");
            } else {
                student.setEmail(email);
            }

        }


    }
}
