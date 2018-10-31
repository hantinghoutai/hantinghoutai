package com.accp.biz.ohl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.ohl.IFunctionDao;
import com.accp.vo.ohl.VoFunctionList;

@Service("functionBiz")
public class FunctionBiz {
	
	@Autowired
	private IFunctionDao dao;
	
	public List<VoFunctionList> leftNavs(int roleID){
		return dao.leftNavs(roleID);
	};
}
