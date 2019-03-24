package lxf.incast.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.swing.LayoutStyle;

import com.alibaba.fastjson.JSON;

import lxf.incast.dao.GradeTableDao;
import lxf.incast.dao.impl.GradeTableDaoImpl;
import lxf.incast.entity.GradeTable;
import lxf.incast.service.GradeTableService;
import lxf.incast.utils.RedisUtils;

/**
 * 1610业务层实现类
 * @author 我有一个小梦想
 * 
 * @date 2019年3月22日 下午9:39:10
 */
public class GradeTableServiceImpl implements GradeTableService {

	private GradeTableDao gradeTableDao = new GradeTableDaoImpl();
	
	/*
	 * 查询全部成绩(non-Javadoc)
	 * @see lxf.incast.service.GradeTableService#getGradeTableList()
	 */
	public List<GradeTable> getGradeTableList() {
		List<GradeTable> gradeTables_list = new ArrayList<GradeTable>();
		String gradeTables = RedisUtils.get("gradetable_list");
		//判断
		if( gradeTables == null ){
			//redis中没有缓存数据
			gradeTables_list = gradeTableDao.getGradeTableList();
			//将查出的数据缓存到redis
			RedisUtils.set("gradetable_list", JSON.toJSON(gradeTables_list).toString());
			System.out.println("This is a Dao!");
			return gradeTables_list;
		} else {
			//将json转成List集合
			gradeTables_list = JSON.parseArray(gradeTables, GradeTable.class);
			System.out.println("This is a Redis!");
			return gradeTables_list;
		}
	}
	
}
