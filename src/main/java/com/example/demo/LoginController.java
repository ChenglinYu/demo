package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenglinyu on 2019-04-14
 * Description:
 */
@RestController
@RequestMapping("/rest")
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Boolean login(@RequestBody User user)
    {
        System.out.println("username"+user.getUserName());
        System.out.println("password"+user.getPassword());
        return Boolean.TRUE;
    }
}