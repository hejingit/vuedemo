package com.example.repository;

import com.example.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: 数据操作接口
 * User: Jin.He
 * Date: 2017-12-27
 * Time: 下午4:18
 */
@Repository
public interface UserRepository {
    List<User> findUserbyUserName(@Param("userName") String userName);

    int getCount();

    int saveUser (User user);

    int modifyUser(User user );

    int removeUser(@Param("userId") int userId);
}
