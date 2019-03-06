package lxf.incast.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lxf.incast.entity.Record;
import lxf.incast.service.RecordService;
import lxf.incast.service.impl.RedcordServiceImpl;

/**
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月3日 上午11:30:33
 */
public class IndexServlet extends HttpServlet {

	private RecordService recordService = new RedcordServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String index = "《《《欢迎来到本网站》》》";
		List<Record> record_list = recordService.RecordAll();
		request.setAttribute("index", index);
		request.setAttribute("record_list", record_list);
		request.getRequestDispatcher("WEB-INF/view/index.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
