package com.alivin.dao;

import com.alivin.pojo.Student;

import java.util.List;

public interface StudentMapper {
    // 查询学生的所有信息
    public List<Student> getStudent();

    public List<Student> getStudent2();
}
