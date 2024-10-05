package com.mongo.mongodb.controller;

import com.mongo.mongodb.model.Address;
import com.mongo.mongodb.model.Student;
import com.mongo.mongodb.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
      StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
     @GetMapping
     public List<Student> fetchStudent(){
       return studentService.getStudents();

     }
     @GetMapping("/id/{id}")
     public Optional<Student> findById(@PathVariable String id){
        // Optional<Student>  studentOptional = studentService.findStudentById(id);
       return studentService.findStudentById(id);

     }
     @PostMapping("/add")
     public Student addStudent(@RequestBody Student student){
            return studentService.createStudent(student);

     }
     @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){

            return studentService.updateStudent(student);

     }
        @DeleteMapping("/delete/id/{id}")
      public String deleteStudent(@PathVariable String id){
              studentService.deleteStudent(id);
              return "Student successfully deleted";
      }

     }


