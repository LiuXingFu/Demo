package lxf.incast.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import lxf.incast.service.impl.DynamicServiceImpl;

/**
 * 异步请求
 * @author 我有一个小梦想
 * 
 * @date 2019年5月4日 下午3:09:54
 */
@Controller
@WebServlet(value="/dynamicPraise")
public class DynamicAJAXServlet extends HttpServlet {
	
	@Autowired
	DynamicServiceImpl dynamicService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String num = req.getParameter("dynamic_praise");
		int dynamic_praise = Integer.parseInt(num);
		String demo_User = req.getParameter("demo_User");
		System.out.println(dynamicService == null);
		dynamicService.updateDynamic(dynamic_praise+1, demo_User);
		resp.getWriter().write(dynamic_praise + 1);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	

}
