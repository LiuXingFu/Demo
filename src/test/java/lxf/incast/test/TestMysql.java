package lxf.incast.test;

import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import lxf.incast.utils.MysqlUtils;

/**
 * mysql操作测试
 * @author 我有一个小梦想
 * 
 * @date 2019年3月4日 上午11:09:34
 */
public class TestMysql {
	private static Statement statement = null;
	
	public static void main(String[] args) throws Exception{
		
		//INSERT();
		/*InetAddress address = InetAddress.getLocalHost();
		System.out.println(address.getHostAddress());*/
		
		try {
			int i = 1/0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("----");
		}
		
	}
	
	/**
	 * 插入数据
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void INSERT() throws SQLException{
		//接收Statement对象
		statement =  MysqlUtils.ReturnStatement();
		//sql
		
		String sql = "insert into record_Demo(record_IP,record_Time) values('测试','测试')";
		int num = statement.executeUpdate(sql);
		System.out.println("影响行数："+num);
		statement.close();
		MysqlUtils.CloseConnection();
		
	}
	

}
