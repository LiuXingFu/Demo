package lxf.incast.entity;

/**
 * 成绩实体类
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月22日 下午9:23:33
 */
public class GradeTable {
	private String student_ID; //学号
	private String student_Name; //姓名
	private String course_Quantity; //课程门数
	private String javaEE; //JavaEE高级编程
	private String jquery; //JQuery应用开发
	private String undergraduate_innovate_education; //大学生创新创业教育
	private String artAppreciation; //美术鉴赏
	private String enterpriseProjectDevelopment; //企业项目开发（一）
	private String softwareTestTechnology; //软件测试技术
	private String softwareOutsourcingEnglish; //软件外包英语（一）
	private String literatureAppreciation; //文学鉴赏
	private String danceAppreciation; //舞蹈鉴赏
	private String formAndPolicy; //形式与政策
	private String speechAndEloquence; //演讲与口才

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

	public String getCourse_Quantity() {
		return course_Quantity;
	}

	public void setCourse_Quantity(String course_Quantity) {
		this.course_Quantity = course_Quantity;
	}

	public String getJavaEE() {
		return javaEE;
	}

	public void setJavaEE(String javaEE) {
		this.javaEE = javaEE;
	}

	public String getJquery() {
		return jquery;
	}

	public void setJquery(String jquery) {
		this.jquery = jquery;
	}

	public String getUndergraduate_innovate_education() {
		return undergraduate_innovate_education;
	}

	public void setUndergraduate_innovate_education(String undergraduate_innovate_education) {
		this.undergraduate_innovate_education = undergraduate_innovate_education;
	}

	public String getArtAppreciation() {
		return artAppreciation;
	}

	public void setArtAppreciation(String artAppreciation) {
		this.artAppreciation = artAppreciation;
	}

	public String getEnterpriseProjectDevelopment() {
		return enterpriseProjectDevelopment;
	}

	public void setEnterpriseProjectDevelopment(String enterpriseProjectDevelopment) {
		this.enterpriseProjectDevelopment = enterpriseProjectDevelopment;
	}

	public String getSoftwareTestTechnology() {
		return softwareTestTechnology;
	}

	public void setSoftwareTestTechnology(String softwareTestTechnology) {
		this.softwareTestTechnology = softwareTestTechnology;
	}

	public String getSoftwareOutsourcingEnglish() {
		return softwareOutsourcingEnglish;
	}

	public void setSoftwareOutsourcingEnglish(String softwareOutsourcingEnglish) {
		this.softwareOutsourcingEnglish = softwareOutsourcingEnglish;
	}

	public String getLiteratureAppreciation() {
		return literatureAppreciation;
	}

	public void setLiteratureAppreciation(String literatureAppreciation) {
		this.literatureAppreciation = literatureAppreciation;
	}

	public String getDanceAppreciation() {
		return danceAppreciation;
	}

	public void setDanceAppreciation(String danceAppreciation) {
		this.danceAppreciation = danceAppreciation;
	}

	public String getFormAndPolicy() {
		return formAndPolicy;
	}

	public void setFormAndPolicy(String formAndPolicy) {
		this.formAndPolicy = formAndPolicy;
	}

	public String getSpeechAndEloquence() {
		return speechAndEloquence;
	}

	public void setSpeechAndEloquence(String speechAndEloquence) {
		this.speechAndEloquence = speechAndEloquence;
	}

	@Override
	public String toString() {
		return "GradeTable [student_ID=" + student_ID + ", student_Name=" + student_Name + ", course_Quantity="
				+ course_Quantity + ", javaEE=" + javaEE + ", jquery=" + jquery + ", undergraduate_innovate_education="
				+ undergraduate_innovate_education + ", artAppreciation=" + artAppreciation
				+ ", enterpriseProjectDevelopment=" + enterpriseProjectDevelopment + ", softwareTestTechnology="
				+ softwareTestTechnology + ", softwareOutsourcingEnglish=" + softwareOutsourcingEnglish
				+ ", literatureAppreciation=" + literatureAppreciation + ", danceAppreciation=" + danceAppreciation
				+ ", formAndPolicy=" + formAndPolicy + ", speechAndEloquence=" + speechAndEloquence + "]";
	}

}
