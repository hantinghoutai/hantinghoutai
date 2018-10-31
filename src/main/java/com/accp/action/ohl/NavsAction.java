package com.accp.action.ohl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.biz.ohl.FunctionBiz;
import com.accp.pojo.Admin;
import com.accp.vo.ohl.VoFunctionList;
import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("/c/ohl")
public class NavsAction {
	
	@Autowired
	private FunctionBiz functionBiz;
	
	@GetMapping("/leftNavs")
	@ResponseBody
	public List<VoFunctionList> leftNavs(HttpSession session){
		String ADMIN_STR= session.getAttribute("ADMIN").toString();
		Admin ADMIN=JSON.parseObject(ADMIN_STR,Admin.class);
		return functionBiz.leftNavs(ADMIN.getRoleid());
	}
}
