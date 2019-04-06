package lxf.incast.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lxf.incast.dao.TeachersUniversityDao;
import lxf.incast.entity.Teachers;

/**
 * 一对多持久层实现类
 * @author 我有一个小梦想
 * 
 * @date 2019年4月6日 上午9:24:29
 */
@Service
public class TeachersUniversityDaoImpl implements TeachersUniversityDao {

	@Autowired
	TeachersUniversityDao universityDao;
	
	/*
	 * 查询指导老师管理的学生(non-Javadoc)
	 * @see lxf.incast.dao.TeachersUniversityDao#getTeachersList()
	 */
	public List<Teachers> getTeachersList() {
		
		return universityDao.getTeachersList();
	}

}
