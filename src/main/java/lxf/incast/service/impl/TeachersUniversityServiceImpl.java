package lxf.incast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lxf.incast.dao.impl.TeachersUniversityDaoImpl;
import lxf.incast.entity.Teachers;
import lxf.incast.service.TeachersUniversityService;

@Service
public class TeachersUniversityServiceImpl implements TeachersUniversityService {

	@Autowired
	TeachersUniversityDaoImpl teachersUniversityDao;
	
	public List<Teachers> getTeachersList() {
		
		return teachersUniversityDao.getTeachersList();
	}

}
