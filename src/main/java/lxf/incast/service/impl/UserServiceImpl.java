package lxf.incast.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lxf.incast.dao.impl.UserDaoImpl;
import lxf.incast.entity.User;
import lxf.incast.pojo.User_Color;
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
	public void register(User_Color user_Color) {
		
		userDaoImpl.register(user_Color);
	}

	/**
	 * 登录
	 */
	public User_Color login(User_Color user_Color) {
		
		return userDaoImpl.login(user_Color);
	}

	/**
	 * 更新
	 */
	public void updateUser(User_Color user_Color) {
		
		userDaoImpl.updateUser(user_Color);
	}

	
}
