package com.accp.action.clm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.clm.SystemStationMessageBiz;
import com.accp.dao.clm.ISystemStationMessage;
import com.accp.pojo.News;
import com.accp.pojo.User;
import com.accp.vo.clm.NewVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;


@RestController
@RequestMapping("/clm/api")
public class SystemStationMessageAction {

	@Autowired
	private SystemStationMessageBiz biz;
	
	@GetMapping("/selectNewInfo/{name}/{pageNum}/{pageSize}")
	public PageInfo<NewVo> selectNewInfo(@PathVariable String name,@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		return biz.selectNewInfo(name,pageNum,pageSize);
	}
	
	@GetMapping("/selectUserInfos/{name}")
	public List<User> selectUserInfo(@PathVariable String name){
		return biz.selectUserInfo(name);
	}
	
	@PostMapping("/addNewInfo")
	public Map<String, String> addNewInfo(@RequestBody NewVo news) {
		Map<String, String> map=new HashMap<String, String>();
		biz.addNewInfo(news);
		map.put("code", "200");
		return map;
	}
}
