package lxf.incast.service;

import java.util.List;

import lxf.incast.entity.Teachers;

/**
 * 一对多业务层接口
 * @author 我有一个小梦想
 * 
 * @date 2019年4月6日 上午9:25:05
 */
public interface TeachersUniversityService {
	// 查询指导老师管理的学生
	public List<Teachers> getTeachersList();
}
