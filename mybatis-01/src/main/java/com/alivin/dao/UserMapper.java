package com.alivin.dao;

import com.alivin.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 查询所有用户信息
    List<User> getUserList();

    // 根据 id 查询用户信息
    User getUserById(int id);

    List<User> getUserLike(String value);

    // 添加用户信息
    int addUser(User user);

    int addUser2(Map<String, Object> map);

    // 更新用户信息
    int updateUser(User user);

    // 删除用户信息
    int deleteUser(int id);
}
