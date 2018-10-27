package com.accp.vo.lfx;

public class Shoppingentry {
private Integer userId;
private String userNickName;
private String shopName;
private String qq;
private String userRealName;
private String weChat;
private String identityNumder;
private Integer identityType;
private Integer liveCityID;
private Integer auditStatus;
private String  identityRealName ;// 海外证件真实姓名，大陆商家用户为空 
private String identityPositiveImg; //证件正面图片路径 
private String identityNegativeImg ; //证件反面图片路径 
private  String identityHandImg;
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getUserNickName() {
	return userNickName;
}
public void setUserNickName(String userNickName) {
	this.userNickName = userNickName;
}
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public String getQq() {
	return qq;
}
public void setQq(String qq) {
	this.qq = qq;
}
public String getUserRealName() {
	return userRealName;
}
public void setUserRealName(String userRealName) {
	this.userRealName = userRealName;
}
public String getWeChat() {
	return weChat;
}
public void setWeChat(String weChat) {
	this.weChat = weChat;
}
public String getIdentityNumder() {
	return identityNumder;
}
public void setIdentityNumder(String identityNumder) {
	this.identityNumder = identityNumder;
}
public Integer getIdentityType() {
	return identityType;
}
public void setIdentityType(Integer identityType) {
	this.identityType = identityType;
}
public Integer getLiveCityID() {
	return liveCityID;
}
public void setLiveCityID(Integer liveCityID) {
	this.liveCityID = liveCityID;
}
public Integer getAuditStatus() {
	return auditStatus;
}
public void setAuditStatus(Integer auditStatus) {
	this.auditStatus = auditStatus;
}
public String getIdentityRealName() {
	return identityRealName;
}
public void setIdentityRealName(String identityRealName) {
	this.identityRealName = identityRealName;
}
public String getIdentityPositiveImg() {
	return identityPositiveImg;
}
public void setIdentityPositiveImg(String identityPositiveImg) {
	this.identityPositiveImg = identityPositiveImg;
}
public String getIdentityNegativeImg() {
	return identityNegativeImg;
}
public void setIdentityNegativeImg(String identityNegativeImg) {
	this.identityNegativeImg = identityNegativeImg;
}
public String getIdentityHandImg() {
	return identityHandImg;
}
public void setIdentityHandImg(String identityHandImg) {
	this.identityHandImg = identityHandImg;
}
public Shoppingentry(Integer userId, String userNickName, String shopName, String qq, String userRealName,
		String weChat, String identityNumder, Integer identityType, Integer liveCityID, Integer auditStatus,
		String identityRealName, String identityPositiveImg, String identityNegativeImg, String identityHandImg) {
	super();
	this.userId = userId;
	this.userNickName = userNickName;
	this.shopName = shopName;
	this.qq = qq;
	this.userRealName = userRealName;
	this.weChat = weChat;
	this.identityNumder = identityNumder;
	this.identityType = identityType;
	this.liveCityID = liveCityID;
	this.auditStatus = auditStatus;
	this.identityRealName = identityRealName;
	this.identityPositiveImg = identityPositiveImg;
	this.identityNegativeImg = identityNegativeImg;
	this.identityHandImg = identityHandImg;
}
public Shoppingentry() {
	super();
}

}
