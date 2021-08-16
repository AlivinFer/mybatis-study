package com.alivin.dao;

import com.alivin.pojo.User;
import com.alivin.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
// 注意是 apache 下的
import org.apache.log4j.Logger;
import org.junit.Test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void test() {
        // 获得 SqlSession 对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行 SQL
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testLog4j() {
        logger.info("info:进入testLog4j");
        logger.debug("debug:进入testLog4j");
        logger.error("error:进入了testLog4j");
    }

    @Test
    public void getUserByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex", 1);
        map.put("pageSize", 2);

        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }


}
