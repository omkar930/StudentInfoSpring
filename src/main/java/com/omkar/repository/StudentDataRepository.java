package com.omkar.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.omkar.StudentInfo.models.Student;

@Component
public class StudentDataRepository {
    private Map<String, Student> students;

    public StudentDataRepository(){
        students = new HashMap<>();
    }

    public Student getStudentById(final String id){
        return students.getOrDefault(id,null);
    }

    public List<Student> getStudentsByUniversity(String university){
        List<Student> res = new ArrayList<>();
        for(Student student: students.values()){
            if(student.getUniversity().equals(university)){
                res.add(student);
            }
        }
        return res;
    }

    public Student addStudent(Student student){
        students.put(student.getId(), student);
        return student;
    }

}
