package lxf.incast.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import lxf.incast.entity.Record;

/**
 * 访问数据的持久层接口
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月6日 下午8:53:27
 */
@Repository
public interface RecordDao {
	// 查询所有的访问数据
	public List<Record> RecordAll();

	// 添加访问数据
	public void RecordAdd(Record record);
}
