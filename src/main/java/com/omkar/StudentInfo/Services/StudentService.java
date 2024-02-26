package com.omkar.StudentInfo.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omkar.StudentInfo.models.Student;
import com.omkar.StudentInfo.repository.StudentDataRepository;

@Service
public class StudentService {
    
    @Autowired
    public StudentDataRepository studentDataRepository;

    public String createStudent(
        String name,
        int age,
        String adhar,
        String university 

    ){
        String randomId = UUID.randomUUID().toString();
        Student student = new Student(randomId, name, age, adhar, university);
        studentDataRepository.addStudent(student);
        return randomId;
    }

    public Student getStudentById(String id){
        return studentDataRepository.getStudentById(id);
    }

    public List<Student> getStudentsByUniversity(String university){
        return studentDataRepository.getStudentsByUniversity(university);
    }
}
