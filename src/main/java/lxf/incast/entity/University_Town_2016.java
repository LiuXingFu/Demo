package lxf.incast.entity;

/**
 * 大学城信息实体类
 * @author 我有一个小梦想
 * 
 * @date 2019年4月4日 下午9:07:34
 */
public class University_Town_2016 {
	private String student_Name; //学生姓名
	private String theClass; //班级
	private String account; //大学城账号
	private String student_Password; //密码
	private String teachers_ID; //指导老师
	
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getTheClass() {
		return theClass;
	}
	public void setTheClass(String theClass) {
		this.theClass = theClass;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getStudent_Password() {
		return student_Password;
	}
	public void setStudent_Password(String student_Password) {
		this.student_Password = student_Password;
	}
	public String getTeachers_ID() {
		return teachers_ID;
	}
	public void setTeachers_ID(String teachers_ID) {
		this.teachers_ID = teachers_ID;
	}
	@Override
	public String toString() {
		return "University_Town_2016 [student_Name=" + student_Name + ", theClass=" + theClass + ", account=" + account
				+ ", student_Password=" + student_Password + ", teachers_ID=" + teachers_ID + "]";
	}
	
}
