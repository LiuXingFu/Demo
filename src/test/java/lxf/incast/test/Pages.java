package lxf.incast.test;

import java.util.ArrayList;
import java.util.List;

import lxf.incast.entity.User;

/**
 * 分页测试
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月24日 上午9:29:05
 */
public class Pages {

	public static void main(String[] args) {
		List<User> arrayList = new ArrayList<User>();
		User user = new User();
		for(int i = 5; i > 0; i--){
			user.setDemo_ID(i);
			user.setDemo_Name("李四"+i);
			user.setDemo_User(i*2);
			user.setDemo_Password("123"+i);
			user.setDemo_Sex("男");
			user.setDemo_Address("郴州");
			user.setDemo_Email(66*i+"@qq.com");
			user.setDemo_Explain("test"+i);
			arrayList.add(user);
		}
		
		System.out.println(arrayList);
	}
	
}
