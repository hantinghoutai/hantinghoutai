package com.accp.vo.clm;

import java.util.Date;

public class AdminVo {
	private Integer adminid;

    private Integer admintype;

    private String name;

    private String password;

    private Date creationtime;

    public AdminVo(Integer adminid, Integer admintype, String name, String password, Date creationtime, Integer roleid,
			String creationip, Integer founder, Date recententry, String ip, String founders) {
		super();
		this.adminid = adminid;
		this.admintype = admintype;
		this.name = name;
		this.password = password;
		this.creationtime = creationtime;
		this.roleid = roleid;
		this.creationip = creationip;
		this.founder = founder;
		this.recententry = recententry;
		this.ip = ip;
		this.founders = founders;
	}

	public AdminVo() {
		super();
	}

	private Integer roleid;

    private String creationip;

    private Integer founder;

    private Date recententry;

    public Integer getAdminid() {
		return adminid;
	}

	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}

	public Integer getAdmintype() {
		return admintype;
	}

	public void setAdmintype(Integer admintype) {
		this.admintype = admintype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreationtime() {
		return creationtime;
	}

	public void setCreationtime(Date creationtime) {
		this.creationtime = creationtime;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getCreationip() {
		return creationip;
	}

	public void setCreationip(String creationip) {
		this.creationip = creationip;
	}

	public Integer getFounder() {
		return founder;
	}

	public void setFounder(Integer founder) {
		this.founder = founder;
	}

	public Date getRecententry() {
		return recententry;
	}

	public void setRecententry(Date recententry) {
		this.recententry = recententry;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getFounders() {
		return founders;
	}

	public void setFounders(String founders) {
		this.founders = founders;
	}

	private String ip;
    
    private String founders;

}
