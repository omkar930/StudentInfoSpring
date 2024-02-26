package com.omkar.StudentInfo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omkar.StudentInfo.Services.StudentService;
import com.omkar.StudentInfo.models.Student;

@RestController
@RequestMapping
public class StudentsController{

    @Autowired
    private StudentService studentService;

    @GetMapping("/geti/{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/create/{name}/{age}/{adhar}/{university}")
    public String createStudent(@PathVariable String name, @PathVariable String age,@PathVariable String adhar,@PathVariable String university){
        String id = studentService.createStudent(name, age, name, university);
        return id;
    }

    @GetMapping("/getu/{university}")
    public List<Student> getStudentsByUniversity(@PathVariable String university){
        return studentService.getStudentsByUniversity(university);
    }

}