package lxf.incast.entity;

/**
 * 用户实体类
 * @author 我有一个小梦想
 * 
 * @date 2019年3月31日 上午9:58:41
 */
public class User {
	private Integer demo_ID; //ID
	private Integer demo_User; //账号
	private String demo_Password; //密码
	private String demo_Name; //用户名
	private String demo_Date; //出身日期
	private String demo_Sex; //性别
	private String demo_Email; //邮箱
	private String demo_Address; //地址
	private String demo_Explain; //说明
	public Integer getDemo_ID() {
		return demo_ID;
	}
	public void setDemo_ID(Integer demo_ID) {
		this.demo_ID = demo_ID;
	}
	public Integer getDemo_User() {
		return demo_User;
	}
	public void setDemo_User(Integer demo_User) {
		this.demo_User = demo_User;
	}
	public String getDemo_Password() {
		return demo_Password;
	}
	public void setDemo_Password(String demo_Password) {
		this.demo_Password = demo_Password;
	}
	public String getDemo_Name() {
		return demo_Name;
	}
	public void setDemo_Name(String demo_Name) {
		this.demo_Name = demo_Name;
	}
	public String getDemo_Date() {
		return demo_Date;
	}
	public void setDemo_Date(String demo_Date) {
		this.demo_Date = demo_Date;
	}
	public String getDemo_Sex() {
		return demo_Sex;
	}
	public void setDemo_Sex(String demo_Sex) {
		this.demo_Sex = demo_Sex;
	}
	public String getDemo_Email() {
		return demo_Email;
	}
	public void setDemo_Email(String demo_Email) {
		this.demo_Email = demo_Email;
	}
	public String getDemo_Address() {
		return demo_Address;
	}
	public void setDemo_Address(String demo_Address) {
		this.demo_Address = demo_Address;
	}
	public String getDemo_Explain() {
		return demo_Explain;
	}
	public void setDemo_Explain(String demo_Explain) {
		this.demo_Explain = demo_Explain;
	}
	@Override
	public String toString() {
		return "User [demo_ID=" + demo_ID + ", demo_User=" + demo_User + ", demo_Password=" + demo_Password
				+ ", demo_Name=" + demo_Name + ", demo_Date=" + demo_Date + ", demo_Sex=" + demo_Sex + ", demo_Email="
				+ demo_Email + ", demo_Address=" + demo_Address + ", demo_Explain=" + demo_Explain + "]";
	}

}
