package lxf.incast.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import lxf.incast.entity.User;

/**
 * 测试页面
 * @author 我有一个小梦想
 * 
 * @date 2019年4月18日 下午1:08:38
 */
@Controller
public class TestController {
	
	
	
	@RequestMapping(value="/testJson")
	@ResponseBody
	public String testJson() {
		List<User> uesr_List = new ArrayList<User>();
		User user = new User();
		for(int i = 5; i > 1; i--){
			user.setDemo_ID(i);
			user.setDemo_Name("李四"+i);
			user.setDemo_User(i*2);
			user.setDemo_Password("123"+i);
			user.setDemo_Sex("男");
			user.setDemo_Address("郴州");
			user.setDemo_Email(66*i+"@qq.com");
			user.setDemo_Explain("test"+i);
			
			uesr_List.add(user);
		}
		return JSON.toJSON(uesr_List).toString();
	}

}
