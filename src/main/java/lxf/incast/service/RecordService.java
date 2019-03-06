package lxf.incast.service;

import java.util.List;

import lxf.incast.entity.Record;

/**
 * 数据访问业务层接口
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月6日 下午9:46:02
 */
public interface RecordService {
	// 查询所有的访问数据
	public List<Record> RecordAll();

	// 添加访问数据
	public void RecordAdd(Record record);
}
