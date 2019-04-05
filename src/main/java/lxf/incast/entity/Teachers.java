package lxf.incast.entity;

import java.util.List;

/**
 * 指导老师实体类
 * @author 我有一个小梦想
 * 
 * @date 2019年4月5日 下午10:08:14
 */
public class Teachers {
	private Integer teachers_ID; //ID
	private String teachers_Name; //指导老师姓名
	private List<University_Town_2016> town_2016_List; //指导老师下的学生（一对多）
	public Integer getTeachers_ID() {
		return teachers_ID;
	}
	public void setTeachers_ID(Integer teachers_ID) {
		this.teachers_ID = teachers_ID;
	}
	public String getTeachers_Name() {
		return teachers_Name;
	}
	public void setTeachers_Name(String teachers_Name) {
		this.teachers_Name = teachers_Name;
	}
	public List<University_Town_2016> getTown_2016_List() {
		return town_2016_List;
	}
	public void setTown_2016_List(List<University_Town_2016> town_2016_List) {
		this.town_2016_List = town_2016_List;
	}
	@Override
	public String toString() {
		return "Teachers [teachers_ID=" + teachers_ID + ", teachers_Name=" + teachers_Name + ", town_2016_List="
				+ town_2016_List + "]";
	}
	
}
