package com.mongo.mongodb.service;

import com.mongo.mongodb.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getStudents ();
    Optional<Student> findStudentById(String id);
    Student createStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(String id);
}
