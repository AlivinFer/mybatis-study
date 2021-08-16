package com.alivin.dao;


import com.alivin.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {

    public List<Teacher> getTeacher(int id);
}
