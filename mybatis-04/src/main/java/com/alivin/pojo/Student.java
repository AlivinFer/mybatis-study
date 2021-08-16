package com.alivin.pojo;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String sname;

    // 将老师和学生关联起来
    private Teacher teacher;
}
