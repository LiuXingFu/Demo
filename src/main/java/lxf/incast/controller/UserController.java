package lxf.incast.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import lxf.incast.pojo.User_Color;
import lxf.incast.service.impl.UserServiceImpl;
import lxf.incast.utils.AccountUserUtils;
import lxf.incast.utils.User_Img;

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
	public String register(User_Color user_Color) {
		userServiceImpl.register(user_Color);
		System.out.println(user_Color);
		accountUserUtils.accountUserUpdate(user_Color.getDemo_User());
		return "redirect:index";
	}
	
	/**
	 * 登录功能
	 * @return
	 */
	@RequestMapping("user_login")
	public String login(HttpServletRequest request, User_Color user_Color, String code) {
		User_Color user_Name = userServiceImpl.login(user_Color);
		HttpSession session = request.getSession();
		//String codes = request.getParameter("code");
		String sCode = (String) request.getSession().getAttribute("sCode");
		System.out.println(code+" ==== "+sCode);
		if(code.equals(sCode)){
			if(user_Name != null){
				if(user_Name.getDemo_userImg() == null){
					user_Name.setDemo_userImg(User_Img.defaultImg);
				}
				session.setAttribute("user", user_Name);
				return "redirect:index";
			} else {
				request.setAttribute("error", "用户名或密码错误请从新登录...！");
				return "user/login";
			}
		} else {
			request.setAttribute("error", "验证码错误...！");
			return "user/login";
		}
	}
	
	/**
	 * 退出登录
	 * @param request
	 * @return
	 */
	@RequestMapping("/exit")
	public String exit(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		return "index/index";
	}

	/**
	 * 更新
	 * @param request
	 * @param user_Color
	 * @return
	 */
	@RequestMapping("/updateUser")
	public String update(HttpServletRequest request, User_Color user_Color) {
		HttpSession session = request.getSession();
		System.out.println(user_Color);
		try {
			userServiceImpl.updateUser(user_Color);
			System.out.println(user_Color);
			session.setAttribute("user", user_Color);
			return "redirect:index";
		} catch (Exception e) {
			request.setAttribute("error", "错误...!");
			return "error";
		}
	}
}
