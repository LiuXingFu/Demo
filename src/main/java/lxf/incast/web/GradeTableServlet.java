package lxf.incast.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lxf.incast.entity.GradeTable;
import lxf.incast.service.GradeTableService;
import lxf.incast.service.impl.GradeTableServiceImpl;

/**
 * 1610展示层
 * @author 我有一个小梦想
 * 
 * @date 2019年3月22日 下午9:45:58
 */
@WebServlet("/gradeTableServlet")
public class GradeTableServlet extends HttpServlet {
	
	private GradeTableService gradeTableService = new GradeTableServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<GradeTable> gradeTable_List = gradeTableService.getGradeTableList();
		request.setAttribute("gradeTable_list", gradeTable_List);
		request.getRequestDispatcher("/WEB-INF/view/gradetable.jsp").forward(request, response);;
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
	}
}
