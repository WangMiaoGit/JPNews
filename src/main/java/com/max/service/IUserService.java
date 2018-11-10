package com.max.service;


import com.max.model.User;

import java.util.Map;

/**
 * Created by 2017063001 on 2018/7/30.
 * 项目名称：MySSM
 * 类描述  ：
 * 创建人  ：MaxWang
 * 创建时间：2018/7/30 14:35
 * 修改人  ：2017063001
 * 修改时间：2018/7/30
 * 修改备注：
 */
public interface IUserService {
    User selectUserFromId(long userId);

    User selectUser(Map<String,String> map);
}
