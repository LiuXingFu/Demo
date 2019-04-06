package lxf.incast.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import lxf.incast.entity.Teachers;

/**
 * 一对多持久层接口
 * @author 我有一个小梦想
 * 
 * @date 2019年4月5日 下午10:16:34
 */
@Repository
public interface TeachersUniversityDao {
	//查询指导老师管理的学生
	public List<Teachers> getTeachersList();
}
