package lxf.incast.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lxf.incast.dao.TeachersUniversityDao;
import lxf.incast.entity.Teachers;

@Service
public class TeachersUniversityDaoImpl implements TeachersUniversityDao {

	@Autowired
	TeachersUniversityDao universityDao;
	
	public List<Teachers> getTeachersList() {
		
		return universityDao.getTeachersList();
	}

}
