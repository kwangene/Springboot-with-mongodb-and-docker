package com.mongo.mongodb.service;

import com.mongo.mongodb.dto.StudentRepository;
import com.mongo.mongodb.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findStudentById(String id) {
        return  studentRepository.findById(id);

    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.insert(student);
    }

    @Override
    public Student updateStudent(Student student) {
        Student saveStudent = studentRepository.findById(student.getId()).orElse(null);
        saveStudent.setFirstName(student.getFirstName());
        saveStudent.setLastName(student.getLastName());
        saveStudent.setEmail(student.getEmail());
        saveStudent.setGender(student.getGender());
        saveStudent.setAddress(student.getAddress());
        saveStudent.setFavoriteSubjects(student.getFavoriteSubjects());
        saveStudent.setTotalSpentInBooks(student.getTotalSpentInBooks());
        saveStudent.setCreatedAt(student.getCreatedAt());

        return studentRepository.save(saveStudent);
    }

    @Override
    public void deleteStudent(String id) {
           studentRepository.deleteById(id);
    }

    public Optional<Student> getStudentByEmail(String email){
        return studentRepository.findStudentByEmail(email);
    }
}
