package lxf.incast.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import lxf.incast.entity.Dynamic;
import lxf.incast.pojo.Dynamic_User;

/**
 * 动态持久层接口
 * @author 我有一个小梦想
 * 
 * @date 2019年5月2日 下午1:31:46
 */
@Repository
public interface DynamicDao {
	//查询所有动态
	public List<Dynamic_User> getDynamicList();
	
	//发布动态
	public void setDynamicAdd(Dynamic_User dynamic_User);
}
