package lxf.incast.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.swing.LayoutStyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class GradeTableServiceImpl implements GradeTableService {

	@Autowired
	private GradeTableDaoImpl gradeTableDao;
	
	/*
	 * 查询全部成绩(non-Javadoc)
	 * @see lxf.incast.service.GradeTableService#getGradeTableList()
	 */
	public List<GradeTable> getGradeTableList() {
		List<GradeTable> gradeTables_list = new ArrayList<GradeTable>();
		gradeTables_list = RedisUtils.get("gradetable_list");
		//判断
		if( gradeTables_list == null ){
			//redis中没有缓存数据
			gradeTables_list = gradeTableDao.getGradeTableList();
			//将查出的数据缓存到redis
			RedisUtils.set("gradetable_list", gradeTables_list);
			System.out.println("This is a Dao!");
			return gradeTables_list;
		} else {
			System.out.println("This is a Redis!");
			return gradeTables_list;
		}
	}

	/*
	 * 根据姓名查询(non-Javadoc)
	 * @see lxf.incast.service.GradeTableService#getGradeTableUserName(java.lang.String)
	 */
	public GradeTable getGradeTableUserName(String userName) {
		
		return gradeTableDao.getGradeTableUserName(userName);
	}
	
}
