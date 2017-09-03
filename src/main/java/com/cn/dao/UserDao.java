package com.cn.dao;

import com.cn.bean.User;

public interface UserDao {

	public User selectByPrimaryKey(Integer id);

	public int insertSelective(User user);

	public void deleteByPrimaryKey(Integer id);
	
	public void updateUser(User user);
}
