package com.accp.action.clm;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.clm.SystemBiz;


@RestController
@RequestMapping("/clm/api")
public class SystemDao {
	
	@Autowired
	 private SystemBiz biz;
	
	 
	 @GetMapping("querySystemById")
	 public System querySystemById(){
		 return biz.querySystemById();
	 }
	 
	 @PutMapping("updateSystem")
	 public Map<String, String> updateSystem(@RequestBody System system) {
		 Map<String, String> map=new HashMap<String, String>();
		 biz.updateSystem(system);
		 map.put("code","200");
		 return map;
	 }
	
}
