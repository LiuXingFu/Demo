package lxf.incast.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * mysql工具类
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月4日 上午10:55:18
 */
public class MysqlUtils {
	
	private static Connection connection = null;
	private static Statement statement = null;
	private static String url = "jdbc:mysql://localhost:3306/test01";
	private static String user = "root";
	private static String password = "liu24357";

	//返回一个Statement对象
	public static Statement ReturnStatement(){
		try {
			// 注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 获取链接
			connection = DriverManager.getConnection(url, user, password);
			// 创建Statement对象
			statement = connection.createStatement();
			// 返回Statement对象
			return statement;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("出错了...");
		}

		return null;
	}

	public static void CloseConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
