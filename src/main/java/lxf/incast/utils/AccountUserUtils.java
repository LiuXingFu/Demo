package lxf.incast.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lxf.incast.dao.AccountDao;

/**
 * 账号创建工具类
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年4月1日 下午3:11:17
 */
@Service
public class AccountUserUtils implements AccountDao {

	@Autowired
	private AccountDao accountDao;

	/*
	 * 获取账号(non-Javadoc)
	 * 
	 * @see lxf.incast.dao.AccountDao#getAccountUser()
	 */
	public int accountUserQuery() {

		return accountDao.accountUserQuery();
	}

	/*
	 * 更新数据库账号值(non-Javadoc)
	 * 
	 * @see lxf.incast.dao.AccountDao#setAccountUser(java.lang.Integer)
	 */
	public void accountUserUpdate(Integer accountUser) {

		accountDao.accountUserUpdate(accountUser);
	}

}
