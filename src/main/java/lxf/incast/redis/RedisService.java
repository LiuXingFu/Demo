package lxf.incast.redis;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

import lxf.incast.entity.Record;
import lxf.incast.service.RecordMybatisService;
import lxf.incast.service.RecordService;
import lxf.incast.service.impl.RecordMybatisServiceImpl;
import lxf.incast.service.impl.RedcordServiceImpl;
import lxf.incast.utils.RedisUtils;
import redis.clients.jedis.BinaryClient.LIST_POSITION;

/**
 * Redis业务层
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月7日 上午10:12:22
 */
public class RedisService {
	
/*	private RedisUtils redisUtils = new RedisUtils();
	private RecordMybatisService recordService = new RecordMybatisServiceImpl();

	*//**
	 * 缓存Record的集合数据
	 *//*
	public void setRedis_Record() {
		List<Record> list = recordService.RecordAll();
		setRedis_Record(list);
	}
	*//**
	 * 缓存Record的集合数据
	 * @param record_list record的list数据集合
	 *//*
	public void setRedis_Record(List<Record> record_list) {
		redisUtils.set("record_list", JSON.toJSON(record_list).toString());
	}
	
	*//**
	 * 获取缓存
	 * @return List<Record>
	 *//*
	public List<Record> getRedis_Record(){
		String key = redisUtils.get("record_list");
		List<Record> list = new ArrayList<Record>();
		//判断
		if(key == null){
			System.out.println("This is a Dao!");
			//如果key为空，则向数据库查询
			list = recordService.RecordAll();
			//将查询出来的数据缓存到redis
			setRedis_Record(list);
			return list;
		} else {
			System.out.println("This is a Redis!");
			//使用JSON将字符串转换成list集合
			list = JSON.parseArray(key, Record.class);
			return list;
		}
	}*/
}










