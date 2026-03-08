package com.jefferson.app;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FirstController {

    private final StudentRepository studentRepository;

    public FirstController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/students")
    public Student postStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    //Get all students
    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    //Get student by id
    @GetMapping("/students/{student-id}")
    public Student findStudentById(@PathVariable("student-id") Integer id) {
        return studentRepository.findById(id)
                .orElse(new Student());
    }

    //Find student by firstName
    @GetMapping("/students/search/{first-name}")
    public List<Student> findStudentByFirstName(@PathVariable("first-name") String name) {
        return studentRepository.findAllByFirstNameContaining(name);
    }

    //Delete a student
    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudentById(@PathVariable("student-id") int id) {
        studentRepository.deleteById(id);
    }
}
