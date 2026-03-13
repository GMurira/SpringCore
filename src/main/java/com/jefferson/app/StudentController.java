package com.jefferson.app;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public StudentResponseDto saveStudent(@RequestBody StudentDto studentDto) {
        return this.studentService.saveStudent(studentDto);
    }


    //Get all students
    @GetMapping("/students")
    public List<StudentResponseDto> findAllStudents() {
        return studentService.findAllStudents();
    }

    //Get student by id
    @GetMapping("/students/{student-id}")
    public StudentResponseDto findStudentById(@PathVariable("student-id") Integer id) {
        return studentService.findStudentById(id);
    }

    //Find student by firstName
    @GetMapping("/students/search/{first-name}")
    public List<StudentResponseDto> findStudentByFirstName(@PathVariable("first-name") String name) {
        return studentService.findStudentByFirstName(name);
    }

    //Delete a student
    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudentById(@PathVariable("student-id") int id) {
        studentService.deleteStudentById(id);
    }
}
