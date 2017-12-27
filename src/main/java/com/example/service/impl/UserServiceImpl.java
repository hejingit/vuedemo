package com.example.service.impl;

import com.example.repository.UserRepository;
import com.example.service.UserService;
import com.example.model.User;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Jin.He
 * Date: 2017-12-27
 * Time: 下午4:25
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Map<String, Object> getTableData(int pageNum, int pageSize, String userName) {

        PageHelper.startPage(pageNum,pageSize);
        List<User> userList=userRepository.findUserbyUserName(userName );
        int count=userRepository.getCount();
        Map<String,Object > tableData=new HashMap<>();
        tableData.put("list",userList);
        tableData.put("count",count);


        return tableData;
    }


}

