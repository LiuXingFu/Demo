package lxf.incast.test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import lxf.incast.utils.MysqlUtils;

public class TestSession implements HttpSessionListener {

	private static Statement statement = null;

	public void sessionCreated(HttpSessionEvent se) {

		/**
		 * ----------将以上的数据存储到数据库-----------
		 */
		synchronized (TestSession.class) {
			// 获取Statement对象
			try {
				// 获取用户的IP
				InetAddress address = null;
				address = InetAddress.getLocalHost();

				String IP = address.getHostAddress();
				// 获取当前的时间
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String time = dateFormat.format(new Date());

				statement = MysqlUtils.ReturnStatement();
				// 准备sql
				String sql = "insert into record_Demo(record_IP,record_Time) values('" + IP + "','" + time + "')";

				int num = statement.executeUpdate(sql);
				statement.close();
				MysqlUtils.CloseConnection();
				System.out.println("影响行数：" + num);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
