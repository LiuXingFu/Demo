package lxf.incast.dao;

import org.springframework.stereotype.Repository;

import lxf.incast.entity.User;

/**
 * 用户持久层接口
 * @author 我有一个小梦想
 * 
 * @date 2019年3月31日 上午10:35:40
 */
@Repository
public interface UserDao {
	//注册
	public void register(User user);
	//登录
	public User login(User user);
}
