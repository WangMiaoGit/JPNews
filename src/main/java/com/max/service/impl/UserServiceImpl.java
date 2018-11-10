package com.max.service.impl;



import com.max.dao.IUserDao;
import com.max.model.User;
import com.max.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User selectUserFromId(long userId) {

        return this.userDao.selectUserFromID(userId);
    }
    @Override
    public User selectUser(Map<String,String> map) {

        return this.userDao.selectUser(map);
    }
}
