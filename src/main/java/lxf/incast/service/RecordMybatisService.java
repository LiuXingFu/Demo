package lxf.incast.service;

import java.util.List;

import lxf.incast.entity.Record;

/**
 * 访问数据业务层接口 mybatis
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月13日 下午12:28:43
 */
public interface RecordMybatisService {
	// 查询所有的访问数据
	public List<Record> RecordAll();

	// 添加访问数据
	public void RecordAdd(Record record);
}
