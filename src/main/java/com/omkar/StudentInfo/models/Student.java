package com.omkar.StudentInfo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private String id;
    private String name;
    private String age;
    private String adhar;
    private String university;
}
