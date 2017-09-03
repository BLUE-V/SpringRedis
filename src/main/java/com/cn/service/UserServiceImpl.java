
package com.cn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cn.bean.User;
import com.cn.dao.UserDao;

/**
 * @类名称： UserServiceImpl
 * @类描述： 
 * @创建人： 1603254
 * @创建时间： 2016-12-2 上午11:10:33
 *
 * @修改人： 1603254
 * @操作时间： 2016-12-2 上午11:10:33
 * @操作原因： 
 * 
 */
@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Cacheable(value="common")
	public User selectByPrimaryKey(Integer id) {
		return userDao.selectByPrimaryKey(id);
	}
	
	@CachePut(value="common",key="#user.id")
	public User insertSelective(User user) {
		userDao.insertSelective(user);
		return user;
	}

	@CacheEvict(value="common")
	public void deleteByPrimaryKey(Integer id) {
		userDao.deleteByPrimaryKey(id);
	}

	@CachePut(value="common",key="#result.id")
	public User updateUser(User user) {
		userDao.updateUser(user);
		return user;
	}
}