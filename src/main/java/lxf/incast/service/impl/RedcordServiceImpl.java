package lxf.incast.service.impl;

import java.util.List;
import lxf.incast.dao.RecordDao;
import lxf.incast.dao.impl.RecordDaoImpl;
import lxf.incast.entity.Record;
import lxf.incast.service.RecordService;

/**
 * 数据访问业务成实现类
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月6日 下午9:47:54
 */
public class RedcordServiceImpl implements RecordService {

	private RecordDao recordDao = new RecordDaoImpl();

	/**
	 * 查询所有访问数据
	 */
	public List<Record> RecordAll() {
		return recordDao.RecordAll();
	}

	/**
	 * 添加访问数据
	 */
	public void RecordAdd(Record record) {
		recordDao.RecordAdd(record);
	}

}
