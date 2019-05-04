package lxf.incast.service;

import java.util.List;

import lxf.incast.dao.DynamicDao;
import lxf.incast.entity.Dynamic;
import lxf.incast.pojo.Dynamic_User;

/**
 * 动态业务层接口
 * @author 我有一个小梦想
 * 
 * @date 2019年5月2日 下午1:41:10
 */
public interface DynamicService extends DynamicDao {
	//查询所有动态
	public List<Dynamic_User> getDynamicList();
	
	//发布动态
	public void setDynamicAdd(Dynamic_User dynamic_User);
}
