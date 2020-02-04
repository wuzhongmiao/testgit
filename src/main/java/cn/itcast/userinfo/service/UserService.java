package cn.itcast.userinfo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.userinfo.mapper.UserMapper;
import cn.itcast.userinfo.pojo.User;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long id) {
        User user=userMapper.queryUserById(id);
        return user;
    }

    public User queryUserByName(String name) {
        User user=userMapper.queryUserByName(name);
        return user;
    }
    
}
