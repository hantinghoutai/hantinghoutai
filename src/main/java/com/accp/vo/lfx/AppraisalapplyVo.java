package com.accp.vo.lfx;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class AppraisalapplyVo {

private Integer applyid;
private String userName;
private String stName;
@JSONField(format="yyyy-MM-dd")
private Date submittime;
@JSONField(format="yyyy-MM-dd")
private Date audittime;
private String adminopinion;

private Integer auditStatus;

public Integer getApplyid() {
	return applyid;
}

public void setApplyid(Integer applyid) {
	this.applyid = applyid;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getStName() {
	return stName;
}

public void setStName(String stName) {
	this.stName = stName;
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

public String getAdminopinion() {
	return adminopinion;
}

public void setAdminopinion(String adminopinion) {
	this.adminopinion = adminopinion;
}

public Integer getAuditStatus() {
	return auditStatus;
}

public void setAuditStatus(Integer auditStatus) {
	this.auditStatus = auditStatus;
}

public AppraisalapplyVo(Integer applyid, String userName, String stName, Date submittime, Date audittime,
		String adminopinion, Integer auditStatus) {
	super();
	this.applyid = applyid;
	this.userName = userName;
	this.stName = stName;
	this.submittime = submittime;
	this.audittime = audittime;
	this.adminopinion = adminopinion;
	this.auditStatus = auditStatus;
}

public AppraisalapplyVo() {
	super();
}





}
