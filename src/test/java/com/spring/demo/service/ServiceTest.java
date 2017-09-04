package com.spring.demo.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;  

import com.spring.demo.bean.User;

@ContextConfiguration(locations="classpath:applicationContext.xml")
@Transactional
public class ServiceTest extends AbstractJUnit4SpringContextTests {
  
    @Autowired  
    private UserService userService;

    @Test
    public void add(){
        User user=new User();
        user.setName("testme456");
        System.out.println("---------------------");
        userService.insertSelective(user);
        System.out.println("---------------------");
        System.out.println("User id is:" + user.getId());

    }

    @Test
    public void  query(){
    	for(int i = 0;i<2;i++){
    		User user = userService.selectByPrimaryKey(3);
    		System.out.println("---------------------");
    		System.out.println(user.toString());
        }
    }

}