package lxf.incast.service.impl;

import java.util.List;

import lxf.incast.dao.RecordMybatisDao;
import lxf.incast.dao.impl.RecordMybatisDaoImpl;
import lxf.incast.entity.Record;
import lxf.incast.service.RecordMybatisService;

/**
 * 访问数据业务层实现类
 * mybatis
 * @author 我有一个小梦想
 * 
 * @date 2019年3月13日 下午12:30:13
 */
public class RecordMybatisServiceImpl implements RecordMybatisService {

	private static RecordMybatisDao mybatisDao = new RecordMybatisDaoImpl();
	
	/*
	 * 查询所有访问数据(non-Javadoc)
	 * @see lxf.incast.service.RecordMybatisService#RecordAll()
	 */
	public List<Record> RecordAll() {
		List<Record> recordList = mybatisDao.RecordAll();
		return recordList;
	}

	/*
	 * 新增访问数据(non-Javadoc)
	 * @see lxf.incast.service.RecordMybatisService#RecordAdd(lxf.incast.entity.Record)
	 */
	public void RecordAdd(Record record) {
		mybatisDao.RecordAdd(record);
	}

}
