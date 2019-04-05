package lxf.incast.entity;

/**
 * 学生信息实体类
 * @author 我有一个小梦想
 * 
 * @date 2019年4月4日 下午10:07:25
 */
public class Student {
	private String student_ID; //学号
	private String student_Name; //姓名
	private String student_Sex; //性别
	private String id_Number; //身份证
	private String address; //住址
	private String student_Contact; //联系方式
	public String getStudent_ID() {
		return student_ID;
	}
	public void setStudent_ID(String student_ID) {
		this.student_ID = student_ID;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getStudent_Sex() {
		return student_Sex;
	}
	public void setStudent_Sex(String student_Sex) {
		this.student_Sex = student_Sex;
	}
	public String getId_Number() {
		return id_Number;
	}
	public void setId_Number(String id_Number) {
		this.id_Number = id_Number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStudent_Contact() {
		return student_Contact;
	}
	public void setStudent_Contact(String student_Contact) {
		this.student_Contact = student_Contact;
	}
	@Override
	public String toString() {
		return "Student [student_ID=" + student_ID + ", student_Name=" + student_Name + ", student_Sex=" + student_Sex
				+ ", id_Number=" + id_Number + ", address=" + address + ", student_Contact=" + student_Contact + "]";
	}
	
}
