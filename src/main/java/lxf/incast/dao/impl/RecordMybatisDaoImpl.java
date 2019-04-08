package lxf.incast.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
@Service
public class RecordMybatisDaoImpl implements RecordMybatisDao {
	
	@Autowired
	private RecordMybatisDao mybatisDao;
	
	/*
	 * 查询所有记录
	 * @see lxf.incast.dao.RecordMybatisDao#RecordAll()
	 */
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Record> RecordAll() {
		List<Record> RecordList = mybatisDao.RecordAll();
		return RecordList;
	}

	/*
	 * 新增数据
	 * @see lxf.incast.dao.RecordMybatisDao#RecordAdd(lxf.incast.entity.Record)
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public void RecordAdd(Record record) {
		mybatisDao.RecordAdd(record);
	}
	

}
