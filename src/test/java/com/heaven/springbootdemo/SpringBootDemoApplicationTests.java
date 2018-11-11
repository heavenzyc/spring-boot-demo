package com.heaven.springbootdemo;

import com.heaven.springbootdemo.dao.UserLoginMapper;
import com.heaven.springbootdemo.dao.UserMapper;
import com.heaven.springbootdemo.entity.User;
import com.heaven.springbootdemo.entity.UserLogin;
import com.heaven.springbootdemo.scala.Student;
import com.heaven.springbootdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class SpringBootDemoApplicationTests {

    @Autowired
    private UserService userService;
    @Autowired
    private UserLoginMapper userLoginMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private Student student;
    @Test
    public void contextLoads() {
    }

    @Test
    public void indexServiceTest() {
        Date start = new Date();
        for (int i = 0; i < 1000000; i++) {
            User user = new User();
            user.setUserName("zyc" + i);
            user.setBadgeNo(i + "");
            user.setDepId(100L + i);
            user.setOrgId(1000L + i);
            user.setUserType(i%3);
            user.setUserStatus(i%2);
            user.setMobile("130" + i);
            user.setUserAddr("天府大道天顺路66号天府名居5栋一单元80"+i);
            user.setGender((i%2) + "");
            user.setIdCard("10000000"+i);
            user.setDirection("都是测试数据,数据很大,啦啦啦啦" + i);
            user.setYn(1);
            user.setCreated(new Date());
            user.setDirectorPhoneNo("13899990000");
            user.setVenderType(i%10);
            user.setUserOrigin(i%5);
            user.setLastUpdUser(Long.valueOf(i));
            user.setLastUpdTime(new Date());
            int res = userService.insertUser(user);
            System.out.println("success ===========================" + res);
        }
        System.out.println("insert complete, time=" + (new Date().getTime() - start.getTime()));
    }

    @Test
    public void insertUserLoginTest() {
        for (int i = 200000; i < 201000; i++) {
            User u = userMapper.selectByPrimaryKey(Long.valueOf(i));
            if (u != null) {
                UserLogin userLogin = new UserLogin();
                userLogin.setUserId(u.getId());
                userLogin.setBadgeNo(u.getBadgeNo());
                userLogin.setAccountFrom(i%4);
                userLogin.setAccountType(i%3);
                userLogin.setCreated(new Date());
                userLogin.setEmail(i + "email@123.com");
                userLogin.setLastUpdTime(new Date());
                userLogin.setLastUpdUser(u.getLastUpdUser());
                userLogin.setLoginNo(u.getMobile());
                userLogin.setPhoneNo(u.getMobile());
                userLogin.setLoginPwd("123456");
                userLogin.setPwdExpiredTime(new Date());
                userLogin.setStatus(i%2);
                userLoginMapper.insert(userLogin);
                System.out.println(i);
            }
        }
    }

    @Test
    public void getUserListTest() {
        student.getUserList();
    }
}
