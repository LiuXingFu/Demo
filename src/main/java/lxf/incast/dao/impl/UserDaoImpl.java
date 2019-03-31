package lxf.incast.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lxf.incast.dao.UserDao;
import lxf.incast.entity.User;

/**
 * 用户持久层实现类
 * @author 我有一个小梦想
 * 
 * @date 2019年3月31日 上午10:38:05
 */
@Service
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private UserDao userDao;

	/**
	 * 注册
	 */
	public void register(User user) {
		
		userDao.register(user);
	}
	
	/**
	 * 登录
	 * @return
	 */
	public User login(User user) {
		
		return userDao.login(user);
	}
	

}