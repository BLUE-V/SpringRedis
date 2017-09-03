package com.cn.service;

import com.cn.bean.User;

public interface UserService {
	public User selectByPrimaryKey(Integer id);
	public User insertSelective(User user);
	public void deleteByPrimaryKey(Integer id);
	public User updateUser(User user);
}