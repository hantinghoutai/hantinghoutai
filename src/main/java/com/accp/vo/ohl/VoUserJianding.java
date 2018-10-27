package com.accp.vo.ohl;

import java.util.Date;

public class VoUserJianding {
	private int applyid;		//鉴定编号
	private int userid;			//用户（商家）编号
	private String username;	//用户名
	private int stid;			//服务类型编号
	private String stname;		//服务类型名称
	private String name;		//姓名
	private int sex;			//性别
	private String phone;		//联系电话
	private Date submittime;	//提交时间
	private String adminopinion;//审核备注
	
	private Date audittime;		//审核时间
	private int auditstatus;	//审核状态
	//自驾游
	private int height;
	private String constellation;
	private int age;
	private String visatype;
	private int documenttype;
	private String certificates;
	private String experience;
	private boolean vehicle;
	private boolean guidecard;
	private String inkorea;
	private String email;
	private String country;
	private String provincialid;
	private String cityid;
	private String detailed;
	//微整形
	private String hospitallicense;
	private String cooperativehospital;
	private String cooperativehospitalurl;
	private String hospitalphone;
	//翻译
	private int translatetype;
	private String translate;
	private boolean office;
	private String officecountry;
	private String officeprovince;
	private String officecity;
	private String officedetailed;
	private String koreaLicense;
	private String translatewebsite;
	//学习资源
	private String studymajor;
	private String schoolreport;
	//留学中介
	private String officialnetworkurl;
	
	
	public String getAdminopinion() {
		return adminopinion;
	}
	public void setAdminopinion(String adminopinion) {
		this.adminopinion = adminopinion;
	}
	public int getApplyid() {
		return applyid;
	}
	public void setApplyid(int applyid) {
		this.applyid = applyid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getSubmittime() {
		return submittime;
	}
	public void setSubmittime(Date submittime) {
		this.submittime = submittime;
	}
	public Date getAudittime() {
		return audittime;
	}
	public void setAudittime(Date audittime) {
		this.audittime = audittime;
	}
	public int getAuditstatus() {
		return auditstatus;
	}
	public void setAuditstatus(int auditstatus) {
		this.auditstatus = auditstatus;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getConstellation() {
		return constellation;
	}
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getVisatype() {
		return visatype;
	}
	public void setVisatype(String visatype) {
		this.visatype = visatype;
	}
	public int getDocumenttype() {
		return documenttype;
	}
	public void setDocumenttype(int documenttype) {
		this.documenttype = documenttype;
	}
	public String getCertificates() {
		return certificates;
	}
	public void setCertificates(String certificates) {
		this.certificates = certificates;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public boolean isVehicle() {
		return vehicle;
	}
	public void setVehicle(boolean vehicle) {
		this.vehicle = vehicle;
	}
	public boolean isGuidecard() {
		return guidecard;
	}
	public void setGuidecard(boolean guidecard) {
		this.guidecard = guidecard;
	}
	public String getInkorea() {
		return inkorea;
	}
	public void setInkorea(String inkorea) {
		this.inkorea = inkorea;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvincialid() {
		return provincialid;
	}
	public void setProvincialid(String provincialid) {
		this.provincialid = provincialid;
	}
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	public String getDetailed() {
		return detailed;
	}
	public void setDetailed(String detailed) {
		this.detailed = detailed;
	}
	public String getHospitallicense() {
		return hospitallicense;
	}
	public void setHospitallicense(String hospitallicense) {
		this.hospitallicense = hospitallicense;
	}
	public String getCooperativehospital() {
		return cooperativehospital;
	}
	public void setCooperativehospital(String cooperativehospital) {
		this.cooperativehospital = cooperativehospital;
	}
	public String getCooperativehospitalurl() {
		return cooperativehospitalurl;
	}
	public void setCooperativehospitalurl(String cooperativehospitalurl) {
		this.cooperativehospitalurl = cooperativehospitalurl;
	}
	public String getHospitalphone() {
		return hospitalphone;
	}
	public void setHospitalphone(String hospitalphone) {
		this.hospitalphone = hospitalphone;
	}
	public int getTranslatetype() {
		return translatetype;
	}
	public void setTranslatetype(int translatetype) {
		this.translatetype = translatetype;
	}
	public String getTranslate() {
		return translate;
	}
	public void setTranslate(String translate) {
		this.translate = translate;
	}
	public boolean isOffice() {
		return office;
	}
	public void setOffice(boolean office) {
		this.office = office;
	}
	public String getOfficecountry() {
		return officecountry;
	}
	public void setOfficecountry(String officecountry) {
		this.officecountry = officecountry;
	}
	public String getOfficeprovince() {
		return officeprovince;
	}
	public void setOfficeprovince(String officeprovince) {
		this.officeprovince = officeprovince;
	}
	public String getOfficecity() {
		return officecity;
	}
	public void setOfficecity(String officecity) {
		this.officecity = officecity;
	}
	public String getOfficedetailed() {
		return officedetailed;
	}
	public void setOfficedetailed(String officedetailed) {
		this.officedetailed = officedetailed;
	}
	public String getKoreaLicense() {
		return koreaLicense;
	}
	public void setKoreaLicense(String koreaLicense) {
		this.koreaLicense = koreaLicense;
	}
	public String getTranslatewebsite() {
		return translatewebsite;
	}
	public void setTranslatewebsite(String translatewebsite) {
		this.translatewebsite = translatewebsite;
	}
	public String getStudymajor() {
		return studymajor;
	}
	public void setStudymajor(String studymajor) {
		this.studymajor = studymajor;
	}
	public String getSchoolreport() {
		return schoolreport;
	}
	public void setSchoolreport(String schoolreport) {
		this.schoolreport = schoolreport;
	}
	public String getOfficialnetworkurl() {
		return officialnetworkurl;
	}
	public void setOfficialnetworkurl(String officialnetworkurl) {
		this.officialnetworkurl = officialnetworkurl;
	}
	
	
}