package com.alivin.dao;

import com.alivin.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUser();

    // select 根据 id 查询
    // 方法存在多个参数，所有的参数前面必须加上 @Param("") 注解
    @Select("select * from user where id = #{uid}")
    User getUserById(@Param("uid") int id);

    // Insert
    @Insert("insert into user(id, uname, pwd) values (#{id}, #{uname}, #{pwd})")
    int addUser(User user);

    // update
    @Update("update user set uname = #{uname}, pwd = #{pwd} where id = #{id}")
    int updateUser(User user);

    // delete
    @Delete("delete from user where id = #{id}")
    int deleteUser(@Param("id") int id);
}
