package lxf.incast.service;

import java.util.List;

import lxf.incast.entity.GradeTable;

/**
 * 1610业务层接口
 * @author 我有一个小梦想
 * 
 * @date 2019年3月22日 下午9:37:26
 */
public interface GradeTableService {
	//查询所有成绩
	public List<GradeTable> getGradeTableList();
	
	//根据姓名查询
	public GradeTable getGradeTableUserName(String userName);
}
