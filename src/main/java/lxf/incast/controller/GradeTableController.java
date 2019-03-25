package lxf.incast.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lxf.incast.connons.PageBean;
import lxf.incast.entity.GradeTable;
import lxf.incast.service.impl.GradeTableServiceImpl;

/**
 * 成绩展示成
 * @author 我有一个小梦想
 * 
 * @date 2019年3月25日 下午3:49:43
 */
@Controller
public class GradeTableController {
	
	@Autowired
	private GradeTableServiceImpl gradeTableService;
	
	/**
	 * 查询所有成绩
	 * @param request
	 * @return
	 */
	@RequestMapping("/gradeTableList")
	public String gradeTableList(HttpServletRequest request) {
		//1)封装PageBean对象
		PageBean pageBean = new PageBean();
		//1.1 当前页数据
		List<GradeTable> list = new ArrayList<GradeTable>();
		list = gradeTableService.getGradeTableList();
		
		System.out.println("-------------");
		
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
		return "gradetable";
	}
	
	@RequestMapping("/gradeTableName")
	public String gradeTableName(HttpServletRequest request, String userName) {
		GradeTable gradeTable = gradeTableService.getGradeTableUserName(userName);
		request.setAttribute("gradeTable", gradeTable);
		return "GradeTable_Condition";
	}
}
