package lxf.incast.service;

import java.util.List;

import lxf.incast.entity.Teachers;

public interface TeachersUniversityService {
	// 指导老师管理的学生
	public List<Teachers> getTeachersList();
}
