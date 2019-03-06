package lxf.incast.entity;

/**
 * 访问数据实体类
 * @author 我有一个小梦想
 * 
 * @date 2019年3月6日 下午8:50:43
 */
public class Record {
	private Integer record_Id; //编号
	private String record_IP; //电脑IP
	private String record_Time; //第一次访问时间
	public Integer getRecord_Id() {
		return record_Id;
	}
	public void setRecord_Id(Integer record_Id) {
		this.record_Id = record_Id;
	}
	public String getRecord_IP() {
		return record_IP;
	}
	public void setRecord_IP(String record_IP) {
		this.record_IP = record_IP;
	}
	public String getRecord_Time() {
		return record_Time;
	}
	public void setRecord_Time(String record_Time) {
		this.record_Time = record_Time;
	}
	@Override
	public String toString() {
		return "Record [record_Id=" + record_Id + ", record_IP=" + record_IP + ", record_Time=" + record_Time + "]";
	}
	
}
