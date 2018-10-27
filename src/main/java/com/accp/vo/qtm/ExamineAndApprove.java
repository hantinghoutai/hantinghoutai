package com.accp.vo.qtm;

import java.sql.Date;

public class ExamineAndApprove {
			private int serviceID;
			private String stName;
			private String serviceTitle;
			private String userName;
			private int auditStatus;
			private int businessState;
			private Date userRegistrationTime;
			private int recommendBool;
			public int getServiceID() {
				return serviceID;
			}
			public void setServiceID(int serviceID) {
				this.serviceID = serviceID;
			}
			public String getStName() {
				return stName;
			}
			public void setStName(String stName) {
				this.stName = stName;
			}
			public String getServiceTitle() {
				return serviceTitle;
			}
			public void setServiceTitle(String serviceTitle) {
				this.serviceTitle = serviceTitle;
			}
			public String getUserName() {
				return userName;
			}
			public void setUserName(String userName) {
				this.userName = userName;
			}
			public int getAuditStatus() {
				return auditStatus;
			}
			public void setAuditStatus(int auditStatus) {
				this.auditStatus = auditStatus;
			}
			public int getBusinessState() {
				return businessState;
			}
			public void setBusinessState(int businessState) {
				this.businessState = businessState;
			}
			public Date getUserRegistrationTime() {
				return userRegistrationTime;
			}
			public void setUserRegistrationTime(Date userRegistrationTime) {
				this.userRegistrationTime = userRegistrationTime;
			}
			public int getRecommendBool() {
				return recommendBool;
			}
			public void setRecommendBool(int recommendBool) {
				this.recommendBool = recommendBool;
			}
}
