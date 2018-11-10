package com.max.dao;


import com.max.model.User;

import java.util.Map;

/**
 * Created by 2017063001 on 2018/7/30.
 * 项目名称：MySSM
 * 类描述  ：
 * 创建人  ：MaxWang
 * 创建时间：2018/7/30 14:39
 * 修改人  ：2017063001
 * 修改时间：2018/7/30
 * 修改备注：
 *          与数据库操作的UserDao.xml中的sql对应  方法名和 xml中id对应
 */
public interface IUserDao {
    User selectUserFromID(long id);
    User selectUser(Map<String,String> map);
}
