package com.spring.demo.dao;

import com.spring.demo.bean.User;

public interface UserDao {

	public User selectByPrimaryKey(Integer id);

	public int insertSelective(User user);

	public void deleteByPrimaryKey(Integer id);
	
	public void updateUser(User user);
}
