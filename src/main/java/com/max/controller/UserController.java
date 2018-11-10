package com.max.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.max.model.User;
import com.max.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
@Controller
@RequestMapping("/user")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser.do")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        User user = this.userService.selectUserFromId(userId);
        ObjectMapper mapper = new ObjectMapper();

        logger.debug("This is my log");

        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }

}
