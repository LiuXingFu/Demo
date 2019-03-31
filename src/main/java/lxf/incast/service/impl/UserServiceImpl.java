package lxf.incast.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lxf.incast.dao.impl.UserDaoImpl;
import lxf.incast.entity.User;
import lxf.incast.service.UserService;

/**
 * 用户业务层实现类
 * @author 我有一个小梦想
 * 
 * @date 2019年3月31日 上午10:42:02
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDaoImpl userDaoImpl;

	/**
	 * 注册
	 */
	public void register(User user) {
		
		userDaoImpl.register(user);
	}

	/**
	 * 登录
	 */
	public User login(User user) {
		
		return userDaoImpl.login(user);
	}
	
}
