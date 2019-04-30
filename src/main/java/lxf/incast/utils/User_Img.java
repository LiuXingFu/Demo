package lxf.incast.utils;

import java.util.UUID;

/**
 * 用户头像工具类
 * @author 我有一个小梦想
 * 
 * @date 2019年4月29日 下午3:47:06
 */
public class User_Img {
	//服务器本地头像存储位置
	public static final String path = "D:\\String\\user_img\\";
	
	//用户注册默认使用头像
	public static final String defaultImg = "ec7c9cb04131ccbf1647602d28ef89e2.jpg";
	
	/**
	 * 头像编号
	 * @return
	 */
	public static String userImgUUID() {
		
		return UUID.randomUUID().toString();
	}
}
