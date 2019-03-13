package lxf.incast.interceptor;

import java.net.InetAddress;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import lxf.incast.entity.Record;
import lxf.incast.redis.RedisService;
import lxf.incast.service.RecordService;
import lxf.incast.service.impl.RedcordServiceImpl;

/**
 * 使用监听，记录用户的ip，时间
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月4日 上午11:57:26
 */
public class ReturnInterceptor implements HttpSessionListener {

	private static Statement statement = null;
	private static Record record = null;
	private RecordService recordService = new RedcordServiceImpl();
	private RedisService redisService = new RedisService();
	
	public void sessionCreated(HttpSessionEvent se) {
		
		/**
		 * ----------将用户IP和第一次访问时间存储到数据库-----------
		 */
		synchronized (ReturnInterceptor.class) {
			// 获取Statement对象
			try {
				// 获取用户的IP
				InetAddress address = null;
				address = InetAddress.getLocalHost();
				String IP = address.getHostAddress();
				// 获取当前的时间
				if(IP != null){
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String time = dateFormat.format(new Date());
					record.setRecord_IP(IP);
					record.setRecord_Time(time);
					recordService.RecordAdd(record);
				}
				redisService.setRedis_Record();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
