package lxf.incast.service;

import lxf.incast.entity.User;

/**
 * 用户业务层接口
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月31日 上午10:40:50
 */
public interface UserService {
	// 注册
	public void register(User user);

	// 登录
	public User login(User user);
}
