package com.accp.vo.ohl;

import java.util.Date;

public class VoUserEls {
	
	private int userID;
	private String userName;
	private String userRealName;
	private String userSex;
	private String userPhone;
	private String contactMailbox;
	private int userMoney;
	private int userIntegral;
	private String adDetail;
	private String merchantType ;
	private Date userRegistrationTime;
	private Date recentEntry;
	
	public VoUserEls() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VoUserEls(int userID, String userName, String userRealName, String userSex, String userPhone,
			String contactMailbox, int userMoney, int userIntegral, String adDetail, String merchantType,
			Date userRegistrationTime, Date recentEntry) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userRealName = userRealName;
		this.userSex = userSex;
		this.userPhone = userPhone;
		this.contactMailbox = contactMailbox;
		this.userMoney = userMoney;
		this.userIntegral = userIntegral;
		this.adDetail = adDetail;
		this.merchantType = merchantType;
		this.userRegistrationTime = userRegistrationTime;
		this.recentEntry = recentEntry;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getContactMailbox() {
		return contactMailbox;
	}
	public void setContactMailbox(String contactMailbox) {
		this.contactMailbox = contactMailbox;
	}
	public int getUserMoney() {
		return userMoney;
	}
	public void setUserMoney(int userMoney) {
		this.userMoney = userMoney;
	}
	public int getUserIntegral() {
		return userIntegral;
	}
	public void setUserIntegral(int userIntegral) {
		this.userIntegral = userIntegral;
	}
	public String getAdDetail() {
		return adDetail;
	}
	public void setAdDetail(String adDetail) {
		this.adDetail = adDetail;
	}
	public String getMerchantType() {
		return merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}
	public Date getUserRegistrationTime() {
		return userRegistrationTime;
	}
	public void setUserRegistrationTime(Date userRegistrationTime) {
		this.userRegistrationTime = userRegistrationTime;
	}
	public Date getRecentEntry() {
		return recentEntry;
	}
	public void setRecentEntry(Date recentEntry) {
		this.recentEntry = recentEntry;
	}
}
