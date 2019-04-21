package lxf.incast.pojo;

/**
 * 用户信息
 * @author 我有一个小梦想
 * 
 * @date 2019年4月21日 下午12:02:15
 */
public class User_Color {
	private Integer demo_ID; //ID
	private Integer demo_User; //账号
	private String demo_Password; //密码
	private String demo_Name; //用户名
	private String demo_Sex; //性别
	private String demo_Email; //邮箱
	private String demo_Address; //地址
	private String demo_Explain; //说明
	private String demo_Color; //用户界面颜色
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
	public String getDemo_Color() {
		return demo_Color;
	}
	public void setDemo_Color(String demo_Color) {
		this.demo_Color = demo_Color;
	}
	@Override
	public String toString() {
		return "User_Color [demo_ID=" + demo_ID + ", demo_User=" + demo_User + ", demo_Password=" + demo_Password
				+ ", demo_Name=" + demo_Name + ", demo_Sex=" + demo_Sex + ", demo_Email=" + demo_Email
				+ ", demo_Address=" + demo_Address + ", demo_Explain=" + demo_Explain + ", demo_Color=" + demo_Color
				+ "]";
	}
	
}
