package lxf.incast.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lxf.incast.entity.User;
import lxf.incast.service.impl.UserServiceImpl;
import lxf.incast.utils.AccountUserUtils;

/**
 * 用户展示层
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月31日 上午10:22:39
 */
@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private AccountUserUtils accountUserUtils;

	@RequestMapping("user/detail")
	public String detail() {
		
		return "user/detail";
	}
	
	/**
	 * 注册功能
	 * @param user
	 * @return
	 */
	@RequestMapping("user_register")
	public String register(User user) {
		user.setDemo_User(accountUserUtils.accountUserQuery());
		userServiceImpl.register(user);
		accountUserUtils.accountUserUpdate(user.getDemo_User());
		System.out.println(user);
		return "redirect:index";
	}
	
	/**
	 * 登录功能
	 * @return
	 */
	@RequestMapping("user_login")
	public String login(HttpServletRequest request, User user, String code) {
		User user_Name = userServiceImpl.login(user);
		HttpSession session = request.getSession();
		String codes = request.getParameter("code");
		String sCode = (String) request.getSession().getAttribute("sCode");
		if(codes.trim().equals(sCode)){
			if(user_Name != null){
				session.setAttribute("user", user_Name);
			} else {
				request.setAttribute("error", "用户名或密码错误请从新登录...！");
				return "error";
			}
		}
		return "redirect:demo_login";
	}
	
	@RequestMapping("/exit")
	public String exit(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		return "login";
	}

}
