package com.alivin.dao;

import com.alivin.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 查询所有用户信息
    List<User> getUserList();

    // 分页
    List<User> getUserByLimit(Map<String, Integer> map);
}
