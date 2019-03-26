package lxf.incast.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lxf.incast.entity.Record;
import lxf.incast.redis.RedisService;
import lxf.incast.service.RecordService;
import lxf.incast.service.impl.RedcordServiceImpl;

/**
 * Demo首页
 * @author 我有一个小梦想
 * 
 * @date 2019年3月3日 上午11:30:33
 */
@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index() {
		
		return "index/index";
	}
	
}
