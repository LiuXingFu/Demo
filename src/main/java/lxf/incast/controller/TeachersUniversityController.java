package lxf.incast.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lxf.incast.entity.Teachers;
import lxf.incast.service.impl.TeachersUniversityServiceImpl;

/**
 * 一对多控制层
 * @author 我有一个小梦想
 * 
 * @date 2019年4月5日 下午10:53:57
 */
@Controller
public class TeachersUniversityController {
	
	@Autowired
	TeachersUniversityServiceImpl teachersUniversityService;
	
	@RequestMapping("/teachers")
	public String teachersUniversityList(HttpServletRequest request) {
		List<Teachers> teachers_List = teachersUniversityService.getTeachersList();
		request.setAttribute("teachers_List", teachers_List);
		return "teachers/teachers_university";
	}
	
}
