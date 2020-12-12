package com.demo.login.test;

import com.demo.login.SpringbootApplication;

import com.demo.login.mapper.UserMapper;
import com.demo.login.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@SpringBootTest(classes = {SpringbootApplication.class})
@RunWith(SpringRunner.class)
public class UserTest {

    @Resource
    private UserMapper usersMapper;

    @Test
    public void testAdd() {
        User user = new User() ;
        user.setPassword("123");
        user.setName("enjoy");
        usersMapper.insert(user);
    }

    @Test
    public void testFindUser() {
        User enjoy = usersMapper.findByUsername("enjoy");
        System.out.println(enjoy);
    }

}
