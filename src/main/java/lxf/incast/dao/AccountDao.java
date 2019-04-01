package lxf.incast.dao;

import org.springframework.stereotype.Repository;

/**
 * 用户账号处理
 * 在数据库中存储一个值，当有用户注册时就查询一次（查出的值+1）
 * @author 我有一个小梦想
 * 
 * @date 2019年4月1日 下午3:06:21
 */
@Repository
public interface AccountDao {
	//查询账号，加1
	public int accountUserQuery();
	
	//更新数据库中存储的值
	public void accountUserUpdate(Integer accountUser);
}
