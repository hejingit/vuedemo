package com.example.controller;

import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Jin.He
 * Date: 2017-12-27
 * Time: 下午3:48
 */
@RestController
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping(value = "getUername")
    public String getUsername(String callback){
        return "admin";
    }

    @GetMapping("getTableData")
    public Map<String,Object> getTableData(int pageNum,int pageSize,String userName){
        return userService.getTableData(pageNum,pageSize,userName );
    }
}
