package com.accp.vo.lfx;

import java.util.Date;

public class tizitousu {
private Integer cid;
private String userName;
private Date TimeOfComplaint;
private String title;
private Integer auditStatus;
private String userNamet;
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public Date getTimeOfComplaint() {
	return TimeOfComplaint;
}
public void setTimeOfComplaint(Date timeOfComplaint) {
	TimeOfComplaint = timeOfComplaint;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Integer getAuditStatus() {
	return auditStatus;
}
public void setAuditStatus(Integer auditStatus) {
	this.auditStatus = auditStatus;
}
public String getUserNamet() {
	return userNamet;
}
public void setUserNamet(String userNamet) {
	this.userNamet = userNamet;
}
public tizitousu(Integer cid, String userName, Date timeOfComplaint, String title, Integer auditStatus,
		String userNamet) {
	super();
	this.cid = cid;
	this.userName = userName;
	TimeOfComplaint = timeOfComplaint;
	this.title = title;
	this.auditStatus = auditStatus;
	this.userNamet = userNamet;
}
public tizitousu() {
	super();
}

}
