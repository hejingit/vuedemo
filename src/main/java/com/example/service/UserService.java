package com.example.service;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Jin.He
 * Date: 2017-12-27
 * Time: 下午4:28
 */
public interface UserService {
    Map<String,Object> getTableData(int pageNum, int pageSize, String userName);
}
