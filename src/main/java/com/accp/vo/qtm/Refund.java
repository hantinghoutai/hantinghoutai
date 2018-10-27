package com.accp.vo.qtm;

import java.sql.Date;

public class Refund {
			private int actualRefundMoney;
			public int getActualRefundMoney() {
				return actualRefundMoney;
			}
			public void setActualRefundMoney(int actualRefundMoney) {
				this.actualRefundMoney = actualRefundMoney;
			}
			private int refundID;
			private String orderID;
			private Date applicationTime;
			private String userName;
			private String serviceTitle;
			private int servicePrice;
			private int auditStatus;
			private Date auditTime;
			private String refundImg;
			private int point;
			private String businessRemarks;
			private int adminStatus;
			private String adminRemarks;
			private Date adminTime;
			public Date getAdminTime() {
				return adminTime;
			}
			public void setAdminTime(Date adminTime) {
				this.adminTime = adminTime;
			}
			public String getBusinessRemarks() {
				return businessRemarks;
			}
			public void setBusinessRemarks(String businessRemarks) {
				this.businessRemarks = businessRemarks;
			}
			public int getAdminStatus() {
				return adminStatus;
			}
			public void setAdminStatus(int adminStatus) {
				this.adminStatus = adminStatus;
			}
			public String getAdminRemarks() {
				return adminRemarks;
			}
			public void setAdminRemarks(String adminRemarks) {
				this.adminRemarks = adminRemarks;
			}
			public int getPoint() {
				return point;
			}
			public void setPoint(int point) {
				this.point = point;
			}
			public int getRefundID() {
				return refundID;
			}
			public void setRefundID(int refundID) {
				this.refundID = refundID;
			}
			public String getOrderID() {
				return orderID;
			}
			public void setOrderID(String orderID) {
				this.orderID = orderID;
			}
			public Date getApplicationTime() {
				return applicationTime;
			}
			public void setApplicationTime(Date applicationTime) {
				this.applicationTime = applicationTime;
			}
			public String getUserName() {
				return userName;
			}
			public void setUserName(String userName) {
				this.userName = userName;
			}
			public String getServiceTitle() {
				return serviceTitle;
			}
			public void setServiceTitle(String serviceTitle) {
				this.serviceTitle = serviceTitle;
			}
			public int getServicePrice() {
				return servicePrice;
			}
			public void setServicePrice(int servicePrice) {
				this.servicePrice = servicePrice;
			}
			public int getAuditStatus() {
				return auditStatus;
			}
			public void setAuditStatus(int auditStatus) {
				this.auditStatus = auditStatus;
			}
			public Date getAuditTime() {
				return auditTime;
			}
			public void setAuditTime(Date auditTime) {
				this.auditTime = auditTime;
			}
			public String getRefundImg() {
				return refundImg;
			}
			public void setRefundImg(String refundImg) {
				this.refundImg = refundImg;
			}
			
			
}
