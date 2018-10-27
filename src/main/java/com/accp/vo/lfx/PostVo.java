package com.accp.vo.lfx;

import java.util.Date;

public class PostVo {
private Integer postID;
private Integer userID;
private Integer fmID;
private String userName;
private String fmName;
private String title;
private String content;
private Date releaseTime;
private Integer operatingState;
private String adminOpinion;
private Integer recommend;
private Integer auditStatus;
public Integer getAuditStatus() {
	return auditStatus;
}
public void setAuditStatus(Integer auditStatus) {
	this.auditStatus = auditStatus;
}
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
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getFmName() {
	return fmName;
}
public void setFmName(String fmName) {
	this.fmName = fmName;
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
public Integer getRecommend() {
	return recommend;
}
public void setRecommend(Integer recommend) {
	this.recommend = recommend;
}


public PostVo() {
	super();
}


}
