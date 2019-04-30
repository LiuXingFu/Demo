package lxf.incast.dao;

import org.springframework.stereotype.Repository;

import lxf.incast.entity.User;
import lxf.incast.pojo.User_Color;

/**
 * 用户持久层接口
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月31日 上午10:35:40
 */
@Repository
public interface UserDao {
	// 注册
	public void register(User_Color user_Color);

	// 登录
	public User_Color login(User_Color user_Color);

	// 更新
	public void updateUser(User_Color user_Color);
	
	// 更新头像
	public void updateUser_Img(User_Color user_Color);
}
