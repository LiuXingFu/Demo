package lxf.incast.service.impl;

import java.util.List;

import lxf.incast.dao.GradeTableDao;
import lxf.incast.dao.impl.GradeTableDaoImpl;
import lxf.incast.entity.GradeTable;
import lxf.incast.service.GradeTableService;

/**
 * 1610业务层实现类
 * @author 我有一个小梦想
 * 
 * @date 2019年3月22日 下午9:39:10
 */
public class GradeTableServiceImpl implements GradeTableService {

	private GradeTableDao gradeTableDao = new GradeTableDaoImpl();
	
	/*
	 * 查询全部成绩(non-Javadoc)
	 * @see lxf.incast.service.GradeTableService#getGradeTableList()
	 */
	public List<GradeTable> getGradeTableList() {
		// TODO Auto-generated method stub
		return gradeTableDao.getGradeTableList();
	}
	
}
