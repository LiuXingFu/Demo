package lxf.incast.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import lxf.incast.dao.RecordMybatisDao;
import lxf.incast.entity.Record;
import lxf.incast.utils.SqlSessionFactorUtils;

/**
 * 访问数据持久层实现类
 * mybatis
 * @author 我有一个小梦想
 * 
 * @date 2019年3月13日 上午11:59:50
 */
public class RecordMybatisDaoImpl implements RecordMybatisDao {
	
	private static SqlSession session = SqlSessionFactorUtils.getSqlSession();
	private static RecordMybatisDao mybatisDao = session.getMapper(RecordMybatisDao.class);
	
	/*
	 * 查询所有记录
	 * @see lxf.incast.dao.RecordMybatisDao#RecordAll()
	 */
	public List<Record> RecordAll() {
		List<Record> RecordList = mybatisDao.RecordAll();
		return RecordList;
	}

	/*
	 * 新增数据
	 * @see lxf.incast.dao.RecordMybatisDao#RecordAdd(lxf.incast.entity.Record)
	 */
	public void RecordAdd(Record record) {
		mybatisDao.RecordAdd(record);
	}
	

}
