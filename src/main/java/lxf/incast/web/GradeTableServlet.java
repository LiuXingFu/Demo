package lxf.incast.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lxf.incast.connons.PageBean;
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
//		List<GradeTable> tables = new ArrayList<GradeTable>();
//		Integer num = (Integer) request.getAttribute("num");
//		List<GradeTable> gradeTable_List = gradeTableService.getGradeTableList();
//		
//		
//		request.setAttribute("page", page);
//		request.setAttribute("gradeTable_list", gradeTable_List);
//		request.getRequestDispatcher("/WEB-INF/view/gradetable.jsp").forward(request, response);;
		t1(request, response);
	}
	
	private void t1(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//1)封装PageBean对象
		PageBean pageBean = new PageBean();
		//1.1 当前页数据
		List<GradeTable> list = new ArrayList<GradeTable>();
		list = gradeTableService.getGradeTableList();
		
		
		
		//1.3 从用户参数中获取当前页数据(currentPage)
		String currentPage = request.getParameter("currentPage");
		if(currentPage==null || currentPage.equals("")){
			//如果用户第一次访问，没有传递currentPage参数，则当前页为1
			currentPage = "1";
		}
		//1.4 总记录数
		pageBean.setTotalCount(list.size());

		pageBean.setCurrentPage(Integer.parseInt(currentPage));
		
		if((pageBean.getCurrentPage()-1)*pageBean.getPageSize()+pageBean.getPageSize() > pageBean.getTotalCount() ){
			pageBean.setData(list.subList((pageBean.getCurrentPage()-1)*pageBean.getPageSize(), pageBean.getTotalCount()));
		} else {
			pageBean.setData(list.subList((pageBean.getCurrentPage()-1)*pageBean.getPageSize(),
					(pageBean.getCurrentPage()-1)*pageBean.getPageSize()+pageBean.getPageSize()));
		}

		//2)把PageBean对象放入域对象中
		request.setAttribute("pageBean", pageBean);
		
		//3)转发到jsp页面显示数据
		request.getRequestDispatcher("/WEB-INF/view/gradetable.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
	}
}
