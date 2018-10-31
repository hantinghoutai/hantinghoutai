package com.accp.vo.clm;

import java.util.List;

public class BaoBiaoChongZhiVo {
	private List<Double> data;
	private Integer name;
	private String type="bar";
	private Integer acquisitionMode;
	public Integer getAcquisitionMode() {
		return acquisitionMode;
	}
	public void setAcquisitionMode(Integer acquisitionMode) {
		this.acquisitionMode = acquisitionMode;
	}
	public List<Double> getData() {
		return data;
	}

	public BaoBiaoChongZhiVo(List<Double> data, Integer name, String type, Integer acquisitionMode) {
		super();
		this.data = data;
		this.name = name;
		this.type = type;
		this.acquisitionMode = acquisitionMode;
	}
	public BaoBiaoChongZhiVo() {
		super();
	}
	public void setData(List<Double> data) {
		this.data = data;
	}
	public Integer getName() {
		return name;
	}
	public void setName(Integer name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
