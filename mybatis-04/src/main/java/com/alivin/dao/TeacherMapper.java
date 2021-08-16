package com.alivin.dao;

import com.alivin.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {

    @Select("select * from teacher where id = #{tid}")
    public Teacher getTeacher(@Param("tid") int id);
}
