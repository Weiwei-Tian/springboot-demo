package com.demo.login.service.Ipml;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.login.entity.User;
import com.demo.login.mapper.UserMapper;
import com.demo.login.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper usersMapper;

    @Override
    public boolean login(String username, String passwd) {
        User users = usersMapper.findByUsername(username);
        return users != null;
    }

    @Override
    public boolean register(String username, String passwd) {
        User users = new User();
        users.setName(username);
        users.setPassword(passwd);
        int cnt = usersMapper.insert(users);
        return cnt > 0;
    }
}
