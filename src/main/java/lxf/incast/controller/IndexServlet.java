package lxf.incast.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lxf.incast.entity.Record;
import lxf.incast.redis.RedisService;
import lxf.incast.service.RecordService;
import lxf.incast.service.impl.RedcordServiceImpl;

/**
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月3日 上午11:30:33
 */
public class IndexServlet extends HttpServlet {

	private RedisService redisService = new RedisService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String index = "《《《欢迎来到本网站》》》";
		/**
		 * 更改为redisService
		 */
		List<Record> record_list = redisService.getRedis_Record();
		request.setAttribute("index", index);
		request.setAttribute("record_list", record_list);
		request.getRequestDispatcher("WEB-INF/view/index.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}