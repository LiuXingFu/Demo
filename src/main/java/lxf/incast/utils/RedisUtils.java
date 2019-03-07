package lxf.incast.utils;

import redis.clients.jedis.Jedis;

/**
 * Redis工具类
 * @author 我有一个小梦想
 * 
 * @date 2019年3月7日 上午9:58:38
 */
public class RedisUtils {
	private static Jedis jedis = null;
	
	/**
	 * 静态代码块，随着类的加载而加载
	 */
	static {
		jedis = new Jedis("127.0.0.1", 6379);
	}
	
	/*
	 * 缓存数据
	 */
	public void set(String key, String value) {
		jedis.set(key, value);
	}
	
	/*
	 * 获取数据
	 */
	public String get(String key) {
		return jedis.get(key);
	}
}
