package lxf.incast.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lxf.incast.dao.GradeTableDao;
import lxf.incast.entity.GradeTable;
import lxf.incast.utils.SqlSessionFactorUtils;

/**
 * 1610成绩持久层实现类
 * @author 我有一个小梦想
 * 
 * @date 2019年3月22日 下午9:32:07
 */
@Service
public class GradeTableDaoImpl implements GradeTableDao {
	
	@Autowired
	private GradeTableDao gradeTableDao;

	/*
	 * 查询所有成绩(non-Javadoc)
	 * @see lxf.incast.dao.GradeTableDao#getGradeTableList()
	 */
	public List<GradeTable> getGradeTableList() {
		
		return gradeTableDao.getGradeTableList();
	}

	/*
	 * 根据姓名查询(non-Javadoc)
	 * @see lxf.incast.dao.GradeTableDao#getGradeTableName(java.lang.String)
	 */
	public GradeTable getGradeTableUserName(String userName) {
		
		return gradeTableDao.getGradeTableUserName(userName);
	}

}
