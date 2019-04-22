package lxf.incast.service;

import lxf.incast.entity.User;
import lxf.incast.pojo.User_Color;

/**
 * 用户业务层接口
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月31日 上午10:40:50
 */
public interface UserService {
	// 注册
	public void register(User_Color user_Color);

	// 登录
	public User_Color login(User_Color user_Color);
	
	//更新
	public void updateUser(User_Color user_Color);
}
