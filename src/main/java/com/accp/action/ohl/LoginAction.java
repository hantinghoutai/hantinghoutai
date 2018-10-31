package com.accp.action.ohl;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.biz.ohl.LoginBiz;
import com.accp.pojo.Admin;
import com.alibaba.fastjson.JSON;
@Controller
@RequestMapping("/c/ohl")
public class LoginAction {
	
	@Autowired
	private LoginBiz loginBiz;
	
	@PostMapping("/login")
	@ResponseBody
	public Admin login(String name,String password,HttpSession session) {
		Admin ADMIN=loginBiz.login(name, password);
		session.setAttribute("ADMIN", JSON.toJSONString(ADMIN));
		return ADMIN;
	}; 
	
	@PostMapping("/out")
	@ResponseBody
	public String out(HttpSession session) {
		session.invalidate();
		return "200";
	}; 
}
