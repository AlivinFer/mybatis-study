package com.alivin.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int id;
    private String tname;
    // 一对多 (老师和学生关联起来)
    private List<Student> students;
}
