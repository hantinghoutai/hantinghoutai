package com.accp.vo.lfx;

import java.util.Date;

public class GoldsRecord {
private Integer recordID;
private String userName;
private Date recordDate;
private String recordDescribe;
private float recordInAndOut ;
private Integer auditStatus;
private Integer acquisitionMode;
private Integer userID;
public Integer getRecordID() {
	return recordID;
}
public void setRecordID(Integer recordID) {
	this.recordID = recordID;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public Date getRecordDate() {
	return recordDate;
}
public void setRecordDate(Date recordDate) {
	this.recordDate = recordDate;
}
public String getRecordDescribe() {
	return recordDescribe;
}
public void setRecordDescribe(String recordDescribe) {
	this.recordDescribe = recordDescribe;
}
public float getRecordInAndOut() {
	return recordInAndOut;
}
public void setRecordInAndOut(float recordInAndOut) {
	this.recordInAndOut = recordInAndOut;
}
public Integer getAuditStatus() {
	return auditStatus;
}
public void setAuditStatus(Integer auditStatus) {
	this.auditStatus = auditStatus;
}
public Integer getAcquisitionMode() {
	return acquisitionMode;
}
public void setAcquisitionMode(Integer acquisitionMode) {
	this.acquisitionMode = acquisitionMode;
}
public Integer getUserID() {
	return userID;
}
public void setUserID(Integer userID) {
	this.userID = userID;
}
public GoldsRecord(Integer recordID, String userName, Date recordDate, String recordDescribe, float recordInAndOut,
		Integer auditStatus, Integer acquisitionMode, Integer userID) {
	super();
	this.recordID = recordID;
	this.userName = userName;
	this.recordDate = recordDate;
	this.recordDescribe = recordDescribe;
	this.recordInAndOut = recordInAndOut;
	this.auditStatus = auditStatus;
	this.acquisitionMode = acquisitionMode;
	this.userID = userID;
}
public GoldsRecord() {
	super();
}


}
