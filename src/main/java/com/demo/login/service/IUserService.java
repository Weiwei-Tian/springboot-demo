package com.demo.login.service;

public interface IUserService {
    boolean login(String username,String passwd);//登录的方法
    boolean register(String username,String passwd);//注册的方法
}

