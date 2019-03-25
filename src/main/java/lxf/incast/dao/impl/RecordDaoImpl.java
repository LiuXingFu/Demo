package lxf.incast.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lxf.incast.dao.RecordDao;
import lxf.incast.entity.Record;
import lxf.incast.utils.MysqlUtils;

/**
 * 访问数据持久层实现类
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月6日 下午8:59:59
 */
@Service
public class RecordDaoImpl implements RecordDao {

	/**
	 * 查询所有的访问数据
	 */
	public List<Record> RecordAll() {
		Connection con = null;
		PreparedStatement tame = null;
		ResultSet rs = null;
		try {
			// 获取链接
			con = MysqlUtils.getConnection();
			// sql
			String sql = "select * from record_demo";
			// 预编译
			tame = con.prepareStatement(sql);
			// 执行
			rs = tame.executeQuery(sql);
			List<Record> list = new ArrayList<Record>();
			// 遍历数据
			while (rs.next()) {
				Record record = new Record();
				record.setRecord_Id(rs.getInt("record_Id"));
				record.setRecord_IP(rs.getString("record_IP"));
				record.setRecord_Time(rs.getString("record_Time"));
				list.add(record);
			}
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			MysqlUtils.close(tame, con, rs);
		}
	}

	/**
	 * 添加访问数据
	 */
	public void RecordAdd(Record record) {
		Connection con = null;
		PreparedStatement tame = null;
		try {
			//获取链接
			con = MysqlUtils.getConnection();
			//sql
			String sql = "insert into record_demo(record_IP,record_Time) values(?,?)";
			//预编译
			tame = con.prepareStatement(sql);
			tame.setString(1, record.getRecord_IP());
			tame.setString(2, record.getRecord_Time());
			//执行
			tame.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}

}
