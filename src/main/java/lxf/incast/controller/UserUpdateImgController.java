package lxf.incast.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import lxf.incast.pojo.User_Color;
import lxf.incast.service.impl.UserServiceImpl;
import lxf.incast.utils.User_Img;

/**
 * 用户更新头像
 * @author 我有一个小梦想
 * 
 * @date 2019年4月29日 下午5:58:03
 */
@Controller
public class UserUpdateImgController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping(value="/user_Img")
	public String userImg(HttpServletRequest request) {
		
		return "user/updateImg";
	}

	/**
	 * 用户更新头像
	 * @param file
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/updateImg", method={RequestMethod.POST, RequestMethod.GET})
	public String updateImg(MultipartFile fileImg, HttpServletRequest request, HttpServletResponse response) 
			throws IOException{
		String uuidImg = User_Img.userImgUUID();
		HttpSession session = request.getSession();
		String oriName = fileImg.getOriginalFilename();
		String extName = oriName.substring(oriName.lastIndexOf("."));
		
		try {
			fileImg.transferTo(new File(User_Img.path + uuidImg + extName));
			User_Color user_Color = (User_Color) session.getAttribute("user");
			try {
				File file = new File(User_Img.path+user_Color.getDemo_userImg());
				boolean fileBoolean = file.exists();
				if(fileBoolean){
					file.delete();
				}
			} catch (Exception e) {
				
			}
			user_Color.setDemo_userImg(uuidImg + extName);
			session.setAttribute("user", user_Color);
			return "redirect:index";
		} catch (Exception e) {
			return "error";
		}
	}
}


















