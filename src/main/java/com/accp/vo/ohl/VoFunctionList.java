package com.accp.vo.ohl;

import java.util.ArrayList;
import java.util.List;

public class VoFunctionList {
    private String title;
    private String href; 
	private List<VoFunction> children=new ArrayList<VoFunction>();
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public List<VoFunction> getChildren() {
		return children;
	}
	public void setChildren(List<VoFunction> children) {
		this.children = children;
	}
	
	
}	
