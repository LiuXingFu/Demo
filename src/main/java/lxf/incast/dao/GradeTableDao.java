package lxf.incast.dao;

import java.util.List;

import lxf.incast.entity.GradeTable;

/**
 * 1610成绩持久层接口
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月22日 下午9:30:15
 */
public interface GradeTableDao {
	// 查询所有成绩
	public List<GradeTable> getGradeTableList();

	// 根据姓名查询
	public GradeTable getGradeTableUserName(String userName);
}
