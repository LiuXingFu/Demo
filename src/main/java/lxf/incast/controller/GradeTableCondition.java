package lxf.incast.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lxf.incast.entity.GradeTable;
import lxf.incast.service.GradeTableService;
import lxf.incast.service.impl.GradeTableServiceImpl;

/**
 * 1610条件查询
 * @author 我有一个小梦想
 * 
 * @date 2019年3月24日 下午3:53:00
 */
public class GradeTableCondition extends HttpServlet {
	
	private GradeTableService gradeTableService = new GradeTableServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String userName = request.getParameter("userName");
		GradeTable gradeTable = gradeTableService.getGradeTableUserName(userName);
		request.setAttribute("gradeTable", gradeTable);
		request.getRequestDispatcher("/WEB-INF/view/GradeTable_Condition.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
