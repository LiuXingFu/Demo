package lxf.incast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lxf.incast.dao.impl.TeachersUniversityDaoImpl;
import lxf.incast.entity.Teachers;
import lxf.incast.service.TeachersUniversityService;

/**
 * 一对多业务层实现类
 * @author 我有一个小梦想
 * 
 * @date 2019年4月6日 上午9:25:34
 */
@Service
public class TeachersUniversityServiceImpl implements TeachersUniversityService {

	@Autowired
	TeachersUniversityDaoImpl teachersUniversityDao;
	
	/*
	 * 查询指导老师管理的学生(non-Javadoc)
	 * @see lxf.incast.service.TeachersUniversityService#getTeachersList()
	 */
	public List<Teachers> getTeachersList() {
		
		return teachersUniversityDao.getTeachersList();
	}

}
