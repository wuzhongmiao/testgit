package cn.itcast.userinfo.mapper;

import cn.itcast.userinfo.pojo.User;

public interface UserMapper {

    User queryUserById(Long id);

    User queryUserByName(String name);

}
