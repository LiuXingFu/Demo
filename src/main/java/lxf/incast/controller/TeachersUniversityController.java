package lxf.incast.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lxf.incast.entity.Teachers;
import lxf.incast.redis.Redis;
import lxf.incast.service.impl.TeachersUniversityServiceImpl;
import lxf.incast.utils.RedisUtils;

/**
 * 一对多控制层
 * 
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
		List<Teachers> teachers_List = new ArrayList<Teachers>();
		teachers_List = RedisUtils.get("teachers_List");
		// 判断
		if (teachers_List == null) {
			// 如果redis中，没有缓存，将从访问数据库，并将缓存到redis中
			teachers_List = teachersUniversityService.getTeachersList();
			RedisUtils.set("teachers_List", teachers_List);
			System.out.println("This is a Dao!");
			request.setAttribute("teachers_List", teachers_List);
			return "teachers/teachers_university";
		} else {
			// redis中有缓存
			teachers_List = RedisUtils.get("teachers_List");
			request.setAttribute("teachers_List", teachers_List);
			System.out.println("This is a Redis!");
			return "teachers/teachers_university";
		}
	}

}
