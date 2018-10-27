package com.accp.action.ohl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.biz.ohl.ShareaBiz;
import com.accp.pojo.Sharea;

@Controller
@RequestMapping("/c/ohl/sharea")
public class ShareaAction {

	@Autowired
	private ShareaBiz shareaBiz;
	
	@GetMapping("/query")
	@ResponseBody
	public List<Sharea> query(String pid,String level){
		return shareaBiz.query(pid, level);
	}
}
