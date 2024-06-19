package com.example.mybatis_text;

import com.example.mybatis_text.mapper.UserMapper;
import com.example.mybatis_text.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisTextApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> userList = userMapper.list();
        userList.stream().forEach(user ->{
                System.out.println(user);
        });
    }

}
