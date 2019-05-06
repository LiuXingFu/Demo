package lxf.incast.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lxf.incast.entity.User;
import lxf.incast.pojo.Dynamic_User;
import lxf.incast.pojo.User_Color;
import lxf.incast.service.impl.DynamicServiceImpl;

/**
 * 用户动态
 * @author 我有一个小梦想
 * 
 * @date 2019年5月2日 下午1:22:12
 */
@Controller
public class DynamicController {
	
	@Autowired
	DynamicServiceImpl dynamicService;
	
	/**
	 * 动态发布页面
	 * @return
	 */
	@RequestMapping(value="/release")
	public String dynamic_Release() {
		
		return "dynamic/dynamic_release";
	}
	
	/**
	 * 动态主页
	 * @return
	 */
	@RequestMapping(value="/dynamic_index")
	public String dynamicIndex(HttpServletRequest request) {
		List<Dynamic_User> dynamic_Users = dynamicService.getDynamicList();
		request.setAttribute("dynamic_Users", dynamic_Users);
		return "dynamic/dynamic_index";
	}
	
	/**
	 * 动态发布
	 * @param request
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/dynamic_release")
	public String dynamicRelease(HttpServletRequest request, Dynamic_User dynamic_User) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		dynamic_User.setDemo_ReleaseDate(dateFormat.format(new Date()));
		dynamicService.setDynamicAdd(dynamic_User);
		return "redirect:dynamic_index";
	}

	@RequestMapping(value="/dynamic_praise")
	@ResponseBody
	public void dynamicPraise(HttpServletResponse response,int dynamic_praise, String demo_User) throws IOException {
		System.err.println(dynamic_praise+"============"+demo_User);
		dynamicService.updateDynamic(dynamic_praise+1, demo_User);
		System.out.println(dynamic_praise);
		response.getWriter().write(String.valueOf(dynamic_praise+1));
	}
}
