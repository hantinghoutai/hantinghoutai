package com.accp.vo.clm;

import java.util.List;

public class BaoBiaoVo {
	private double data;
	private Integer name;
	private String type="bar";

	public Integer getName() {
		return name;
	}
	public double getData() {
		return data;
	}
	public void setData(double data) {
		this.data = data;
	}
	public void setName(Integer name) {
		this.name = name;
	}
	public BaoBiaoVo() {
		super();
	}
	public BaoBiaoVo(double data, Integer name, String type) {
		super();
		this.data = data;
		this.name = name;
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	


}
