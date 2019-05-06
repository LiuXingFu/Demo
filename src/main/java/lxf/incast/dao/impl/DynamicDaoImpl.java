package lxf.incast.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lxf.incast.dao.DynamicDao;
import lxf.incast.entity.Dynamic;
import lxf.incast.pojo.Dynamic_User;

/**
 * 动态持久层实现类
 * @author 我有一个小梦想
 * 
 * @date 2019年5月2日 下午1:38:36
 */
@Service
public class DynamicDaoImpl implements DynamicDao {
	
	@Autowired
	private DynamicDao dynamicDao;

	/*
	 * 查询所有动态(non-Javadoc)
	 * @see lxf.incast.dao.DynamicDao#getDynamicList()
	 */
	public List<Dynamic_User> getDynamicList() {
		
		return dynamicDao.getDynamicList();
	}

	/*
	 * 发布动态(non-Javadoc)
	 * @see lxf.incast.dao.DynamicDao#setDynamicAdd(lxf.incast.pojo.Dynamic_User)
	 */
	public void setDynamicAdd(Dynamic_User dynamic_User) {
		
		dynamicDao.setDynamicAdd(dynamic_User);
	}

	/*
	 * 动态赞(non-Javadoc)
	 * @see lxf.incast.dao.DynamicDao#updateDynamic(int)
	 */
	public void updateDynamic(int praise, String demo_User) {
		
		dynamicDao.updateDynamic(praise, demo_User);
	}

}
