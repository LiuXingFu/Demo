package lxf.incast.utils;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Mybatis工具类
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月13日 上午11:47:59
 */
public class SqlSessionFactorUtils {
	private static SqlSessionFactory sessionFactory = null;

	// 初始化创建SqlsessionFactory对象
	static {
		try {
			// 读取mybatis-config.xml文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//获取静态SqlSession对象的静态方法
	public static SqlSession getSqlSession() {
		return sessionFactory.openSession();
	}
	
	//获取SqlSessionFactory的静态方法
	public static SqlSessionFactory getSqlSessionFactory() {
		return sessionFactory;
	}
}
