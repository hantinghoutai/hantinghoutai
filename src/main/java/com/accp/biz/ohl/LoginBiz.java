package com.accp.biz.ohl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.accp.dao.ohl.ILoginDao;
import com.accp.pojo.Admin;

@Service("loginBiz")
public class LoginBiz {
	
	@Autowired
	private ILoginDao dao;
	
	public Admin login(String name,String password) {
		return dao.login(name, password);
	};
}
