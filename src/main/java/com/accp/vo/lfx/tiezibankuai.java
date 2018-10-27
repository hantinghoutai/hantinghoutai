package com.accp.vo.lfx;

import java.util.Date;

public class tiezibankuai {
private Integer postID;
private Integer userID;
private Integer fmID;
private String title;
private String content;
private Date releaseTime;
private Integer operatingState;
private String adminOpinion;
private Integer auditStatus;
private String fmName;
private Integer integral;
private String name;
private Integer sort;
private Integer pid;
public Integer getPostID() {
	return postID;
}
public void setPostID(Integer postID) {
	this.postID = postID;
}
public Integer getUserID() {
	return userID;
}
public void setUserID(Integer userID) {
	this.userID = userID;
}
public Integer getFmID() {
	return fmID;
}
public void setFmID(Integer fmID) {
	this.fmID = fmID;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getReleaseTime() {
	return releaseTime;
}
public void setReleaseTime(Date releaseTime) {
	this.releaseTime = releaseTime;
}
public Integer getOperatingState() {
	return operatingState;
}
public void setOperatingState(Integer operatingState) {
	this.operatingState = operatingState;
}
public String getAdminOpinion() {
	return adminOpinion;
}
public void setAdminOpinion(String adminOpinion) {
	this.adminOpinion = adminOpinion;
}
public Integer getAuditStatus() {
	return auditStatus;
}
public void setAuditStatus(Integer auditStatus) {
	this.auditStatus = auditStatus;
}
public String getFmName() {
	return fmName;
}
public void setFmName(String fmName) {
	this.fmName = fmName;
}
public Integer getIntegral() {
	return integral;
}
public void setIntegral(Integer integral) {
	this.integral = integral;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getSort() {
	return sort;
}
public void setSort(Integer sort) {
	this.sort = sort;
}
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public tiezibankuai(Integer postID, Integer userID, Integer fmID, String title, String content, Date releaseTime,
		Integer operatingState, String adminOpinion, Integer auditStatus, String fmName, Integer integral, String name,
		Integer sort, Integer pid) {
	super();
	this.postID = postID;
	this.userID = userID;
	this.fmID = fmID;
	this.title = title;
	this.content = content;
	this.releaseTime = releaseTime;
	this.operatingState = operatingState;
	this.adminOpinion = adminOpinion;
	this.auditStatus = auditStatus;
	this.fmName = fmName;
	this.integral = integral;
	this.name = name;
	this.sort = sort;
	this.pid = pid;
}
public tiezibankuai() {
	super();
}

}
