package com.accp.vo.clm;

public class AdvertisingVo {
	private Integer aid;

    public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public AdvertisingVo() {
		super();
	}

	public AdvertisingVo(Integer aid, String atitle, Integer aorder, String aimgpath, String apcurl, String aappurl,
			String adescribe, String atname, String atpx) {
		super();
		this.aid = aid;
		this.atitle = atitle;
		this.aorder = aorder;
		this.aimgpath = aimgpath;
		this.apcurl = apcurl;
		this.aappurl = aappurl;
		this.adescribe = adescribe;
		this.atname = atname;
		this.atpx = atpx;
	}

	public String getAtitle() {
		return atitle;
	}

	public void setAtitle(String atitle) {
		this.atitle = atitle;
	}

	public Integer getAorder() {
		return aorder;
	}

	public void setAorder(Integer aorder) {
		this.aorder = aorder;
	}

	public String getAimgpath() {
		return aimgpath;
	}

	public void setAimgpath(String aimgpath) {
		this.aimgpath = aimgpath;
	}

	public String getApcurl() {
		return apcurl;
	}

	public void setApcurl(String apcurl) {
		this.apcurl = apcurl;
	}

	public String getAappurl() {
		return aappurl;
	}

	public void setAappurl(String aappurl) {
		this.aappurl = aappurl;
	}

	public String getAdescribe() {
		return adescribe;
	}

	public void setAdescribe(String adescribe) {
		this.adescribe = adescribe;
	}

	public String getAtname() {
		return atname;
	}

	public void setAtname(String atname) {
		this.atname = atname;
	}

	public String getAtpx() {
		return atpx;
	}

	public void setAtpx(String atpx) {
		this.atpx = atpx;
	}

	private String atitle;

    private Integer aorder;

    private String aimgpath;

    private String apcurl;

    private String aappurl;

    private String adescribe;

    private String atname;

    private String atpx;
}
