package lxf.incast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lxf.incast.dao.impl.DynamicDaoImpl;
import lxf.incast.entity.Dynamic;
import lxf.incast.pojo.Dynamic_User;
import lxf.incast.service.DynamicService;

/**
 * 动态业务层实现类
 * @author 我有一个小梦想
 * 
 * @date 2019年5月2日 下午1:43:42
 */
@Service
public class DynamicServiceImpl implements DynamicService {
	
	@Autowired
	private DynamicDaoImpl dynamicDao;

	/*
	 * 查询所有的动态(non-Javadoc)
	 * @see lxf.incast.service.DynamicService#getDynamicList()
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

}
