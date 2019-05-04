package lxf.incast.pojo;

import lxf.incast.entity.User;

/**
 * 动态展示
 * @author 我有一个小梦想
 * 
 * @date 2019年5月2日 下午2:13:41
 */
public class Dynamic_User extends User_Color {
	private String demo_Dynamic; //内容
	private String demo_ReleaseDate; //发布时间
	private int demo_Praise; //赞数
	
	public String getDemo_Dynamic() {
		return demo_Dynamic;
	}
	public void setDemo_Dynamic(String demo_Dynamic) {
		this.demo_Dynamic = demo_Dynamic;
	}
	public String getDemo_ReleaseDate() {
		return demo_ReleaseDate;
	}
	public void setDemo_ReleaseDate(String demo_ReleaseDate) {
		this.demo_ReleaseDate = demo_ReleaseDate;
	}
	public int getDemo_Praise() {
		return demo_Praise;
	}
	public void setDemo_Praise(int demo_Praise) {
		this.demo_Praise = demo_Praise;
	}
	@Override
	public Integer getDemo_User() {
		// TODO Auto-generated method stub
		return super.getDemo_User();
	}
	@Override
	public void setDemo_User(Integer demo_User) {
		// TODO Auto-generated method stub
		super.setDemo_User(demo_User);
	}
	@Override
	public String getDemo_Name() {
		// TODO Auto-generated method stub
		return super.getDemo_Name();
	}
	@Override
	public void setDemo_Name(String demo_Name) {
		// TODO Auto-generated method stub
		super.setDemo_Name(demo_Name);
	}
	@Override
	public String getDemo_userImg() {
		// TODO Auto-generated method stub
		return super.getDemo_userImg();
	}
	@Override
	public void setDemo_userImg(String demo_userImg) {
		// TODO Auto-generated method stub
		super.setDemo_userImg(demo_userImg);
	}
	@Override
	public String toString() {
		return "Dynamic_User [demo_Dynamic=" + demo_Dynamic + ", demo_ReleaseDate=" + demo_ReleaseDate
				+ ", demo_Praise=" + demo_Praise + ", getDemo_Dynamic()=" + getDemo_Dynamic()
				+ ", getDemo_ReleaseDate()=" + getDemo_ReleaseDate() + ", getDemo_Praise()=" + getDemo_Praise()
				+ ", getDemo_User()=" + getDemo_User() + ", getDemo_Name()=" + getDemo_Name() + ", getDemo_userImg()="
				+ getDemo_userImg() + "]";
	}
	
}
