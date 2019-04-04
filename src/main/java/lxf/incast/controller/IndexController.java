package lxf.incast.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lxf.incast.entity.Record;
import lxf.incast.redis.RedisService;
import lxf.incast.service.RecordService;
import lxf.incast.service.impl.RedcordServiceImpl;
import lxf.incast.utils.ValidateCodeUtil;

/**
 * Demo首页
 * @author 我有一个小梦想
 * 
 * @date 2019年3月3日 上午11:30:33
 */
@Controller
public class IndexController {

	/**
	 * Demo首页
	 * @return
	 */
	@RequestMapping("/demo")
	public String demo() {
		
		return "demo";
	}
	@RequestMapping("/demo_login")
	public String demo_login() {
		
		return "login";
	}
	
	@RequestMapping("/index")
	public String index() {
		
		return "index/index";
	}
	/**
	 * 用户登录注册首页
	 * @return
	 */
	@RequestMapping("/user/index")
	public String userIndex(){
		
		return "user/index";
	}
	
	/**
	 * 注册页面
	 * @return
	 */
	@RequestMapping("/register")
	public String userRegister() {
		
		return "user/register";
	}
	
	/**
	 * 登录页面
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/login")
	public String userLogin() {
		
		return "user/login";
	}
	
	/**
	 * 验证码
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/imgCode")
	public String ImgLogin(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		HttpSession session = request.getSession();
		OutputStream out = response.getOutputStream();
		String code = ValidateCodeUtil.genNewCode(out);
		session.setAttribute("sCode", code);
		return "user/login";
	}
	
}
