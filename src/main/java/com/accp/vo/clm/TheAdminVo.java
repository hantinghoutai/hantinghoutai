package com.accp.vo.clm;

import java.util.Date;

public class TheAdminVo {

	private Integer adminlogid;

    private Integer adminid;

    public TheAdminVo(Integer adminlogid, Integer adminid, Date remarkstime, String remarksip, String remarks,
			String name) {
		super();
		this.adminlogid = adminlogid;
		this.adminid = adminid;
		this.remarkstime = remarkstime;
		this.remarksip = remarksip;
		this.remarks = remarks;
		this.name = name;
	}

	public TheAdminVo() {
		super();
	}

	private Date remarkstime;

    private String remarksip;

    public Integer getAdminlogid() {
		return adminlogid;
	}

	public void setAdminlogid(Integer adminlogid) {
		this.adminlogid = adminlogid;
	}

	public Integer getAdminid() {
		return adminid;
	}

	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}

	public Date getRemarkstime() {
		return remarkstime;
	}

	public void setRemarkstime(Date remarkstime) {
		this.remarkstime = remarkstime;
	}

	public String getRemarksip() {
		return remarksip;
	}

	public void setRemarksip(String remarksip) {
		this.remarksip = remarksip;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String remarks;
    
    private String name;

}
