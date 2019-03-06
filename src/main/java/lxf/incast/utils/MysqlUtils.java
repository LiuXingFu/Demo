package lxf.incast.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * mysql工具类
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月4日 上午10:55:18
 */
public class MysqlUtils {

	private static String url = null;
	private static String user = null;
	private static String password = null;
	private static String driverClass = null;
	
	/**
	 * 静态代码块，随着类的加载而加载
	 */
	static {
		try {
			//读取jdbc.properties文件
			Properties properties = new Properties();
			//使用类路径方式读取配置文件
			InputStream inputStream = MysqlUtils.class.getResourceAsStream("/jdbc.properties");
			//加载文件
			properties.load(inputStream);
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
			driverClass = properties.getProperty("driverClass");
			//注册驱动
			Class.forName(driverClass);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取链接资源
	 * @return connection
	 */
	public static Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 关闭资源
	 * @param statement 执行静态sql
	 * @param connection 链接对象
	 */
	public static void close(Statement statement, Connection connection) {
		if(statement != null){
			try {
				statement.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		if(connection != null){
			try {
				connection.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
	
	/**
	 * 关闭资源
	 * @param statement 执行静态sql
	 * @param connection 链接对象
	 * @param resultSet 结果集对象
	 */
	public static void close(Statement statement, Connection connection, ResultSet resultSet) {
		if(resultSet != null){
			try {
				resultSet.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		if(statement != null){
			try {
				statement.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		if(connection != null){
			try {
				connection.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

}
