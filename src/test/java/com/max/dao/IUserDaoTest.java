package com.max.dao;



import com.max.model.User;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by 2017063001 on 2018/8/23.
 * 项目名称：MySSM
 * 类描述  ：
 * 创建人  ：MaxWang
 * 创建时间：2018/8/23 15:22
 * 修改人  ：2017063001
 * 修改时间：2018/8/23
 * 修改备注：
 */
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {




    @Autowired
    private IUserDao dao;

    @Test
    public void testSelectUser() throws Exception {
//        long id = 1;
//        User user = dao.selectUserFromID(id);
//        System.out.println(user.toString());

        Map<String,String> map = new HashMap<>();
        map.put("userNum","2017063001");
        map.put("userPwd","123");
        User user = dao.selectUser(map);
        if (user!=null){

            System.out.println(user.toString());
        }


       /* SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
        Calendar calendar = Calendar.getInstance();
        //获取月份，0表示1月份
        calendar.add(Calendar.MONTH, 0);//获取上个月月份
        String format = formatter.format(calendar.getTime());
        String month = format.substring(5,7);

        System.out.println(month);*/

        /*Calendar now = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowString = sdf.format(now.getTimeInMillis()).substring(11, 19);


        System.out.println("nowString========="+nowString.substring(0,5));*/
    }

}
