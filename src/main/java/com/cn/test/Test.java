package com.cn.test;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;  
  
import com.cn.bean.User;  
import com.cn.service.UserService;  
  
  
@ContextConfiguration(locations="classpath:spring-mvc.xml")  
public class Test extends AbstractJUnit4SpringContextTests {  
  
    @Autowired  
    private UserService userService;  
      
    private static int index;  
      
/*    @org.junit.Test  
    public void add(){  
        User user=new User();  
        user.setName("testme");
    	System.out.println("---------------------");
        userService.insertSelective(user);
    	System.out.println("---------------------");
        index = user.getId();
    }  */
      
      
    @org.junit.Test  
    public void  query(){
    	for(int i = 0;i<2;i++){
    		User user = userService.selectByPrimaryKey(15); 
    		System.out.println("---------------------");
    		System.out.println(user.toString());
        }  
    }  
} 