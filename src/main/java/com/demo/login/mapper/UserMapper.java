package com.demo.login.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;
import com.demo.login.entity.User;

@Mapper
public interface UserMapper {
    /**
     * 用户添加
     * @param user
     * @return
     */
    Integer insert(User user);

    /**
     * 查找用户名
     * @param username
     * @return
     */
    User findByUsername(String username);

    /** 
     * 根据id查找信息
     * @param id
     * @return
     */
    User findById(Integer id);

}
