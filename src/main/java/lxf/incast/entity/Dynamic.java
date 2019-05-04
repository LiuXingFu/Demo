package lxf.incast.entity;

/**
 * 动态实体类
 * @author 我有一个小梦想
 * 
 * @date 2019年5月2日 下午1:34:05
 */
public class Dynamic {
	private String demo_Dynamic_ID; //动态编号
	private String demo_User; //用户账号
	private String dmeo_Dynamic; //内容
	private String demo_ReleaseDate; //发布时间
	private String demo_Praise; //赞数
	public String getDemo_Dynamic_ID() {
		return demo_Dynamic_ID;
	}
	public void setDemo_Dynamic_ID(String demo_Dynamic_ID) {
		this.demo_Dynamic_ID = demo_Dynamic_ID;
	}
	public String getDemo_User() {
		return demo_User;
	}
	public void setDemo_User(String demo_User) {
		this.demo_User = demo_User;
	}
	public String getDmeo_Dynamic() {
		return dmeo_Dynamic;
	}
	public void setDmeo_Dynamic(String dmeo_Dynamic) {
		this.dmeo_Dynamic = dmeo_Dynamic;
	}
	public String getDemo_ReleaseDate() {
		return demo_ReleaseDate;
	}
	public void setDemo_ReleaseDate(String demo_ReleaseDate) {
		this.demo_ReleaseDate = demo_ReleaseDate;
	}
	public String getDemo_Praise() {
		return demo_Praise;
	}
	public void setDemo_Praise(String demo_Praise) {
		this.demo_Praise = demo_Praise;
	}
	@Override
	public String toString() {
		return "Dynamic [demo_Dynamic_ID=" + demo_Dynamic_ID + ", demo_User=" + demo_User + ", dmeo_Dynamic="
				+ dmeo_Dynamic + ", demo_ReleaseDate=" + demo_ReleaseDate + ", demo_Praise=" + demo_Praise + "]";
	}
	
}
