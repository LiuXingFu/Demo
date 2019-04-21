package lxf.incast.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import lxf.incast.dao.UserDao;
import lxf.incast.entity.User;
import lxf.incast.pojo.User_Color;

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
	@Transactional(propagation = Propagation.REQUIRED)
	public void register(User_Color user_Color) {
		
		userDao.register(user_Color);
	}
	
	/**
	 * 登录
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS)
	public User_Color login(User_Color user_Color) {
		
		return userDao.login(user_Color);
	}
	

}
