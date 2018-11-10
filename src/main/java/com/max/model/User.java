package com.max.model;

import java.util.Date;

/**
 * Created by 2017063001 on 2018/7/30.
 * 项目名称：MySSM
 * 类描述  ：
 * 创建人  ：MaxWang
 * 创建时间：2018/7/30 14:39
 * 修改人  ：2017063001
 * 修改时间：2018/7/30
 * 修改备注：
 * 对应数据库的实体类
 */
public class User {
    private long id;
    private String userNum;
    private String userPwd;
    private String userName;
    private String type;

    public User() {
    }

    public User(long id, String userNum, String userPwd, String userName, String type) {
        this.id = id;
        this.userNum = userNum;
        this.userPwd = userPwd;
        this.userName = userName;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userNum='" + userNum + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userName='" + userName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
