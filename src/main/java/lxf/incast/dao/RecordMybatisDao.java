package lxf.incast.dao;

import java.util.List;

import lxf.incast.entity.Record;

/**
 * 访问数据持久层 mybatis
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月13日 上午11:58:04
 */
public interface RecordMybatisDao {
	// 查询所有的访问数据
	public List<Record> RecordAll();

	// 添加访问数据
	public void RecordAdd(Record record);
}
