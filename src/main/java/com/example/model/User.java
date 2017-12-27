package com.example.model;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Jin.He
 * Date: 2017-12-27
 * Time: 下午4:19
 */
public class User {


    private Integer userId;

    private String userName;

    private Byte sex;

    private Date createTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
