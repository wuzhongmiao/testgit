package cn.itcast.userinfo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.userinfo.pojo.User;
import cn.itcast.userinfo.service.UserService;

@RequestMapping("user")
@Controller
public class UserController {
    @Autowired
    private static UserService userSerive;
    
    //http:127.0.0.0:/user/query/1
    //根据用户的id获得用户的信息
    @RequestMapping(value={"query/{id}"},method=RequestMethod.GET)
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long id){
        User user=userSerive.queryUserById(id);
        return user;
    }
  //http:127.0.0.0:/user/query?userName=""
    //根据用户的名称获得用户的信息
    @RequestMapping(value={"query"},method=RequestMethod.GET)
    @ResponseBody
    public User queryUserByName(@RequestParam("userName") String userName){
        User user=userSerive.queryUserByName(userName);
        return user;
    }
    
    
}
