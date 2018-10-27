package com.accp.action.qtm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.qtm.ClassOfServiceBiz;
import com.accp.pojo.Servicetype;


@RestController
@RequestMapping("/api")
public class ClassOfserviceAction {
			@Autowired
			private ClassOfServiceBiz biz;
			
			@GetMapping("select")
			public List<Servicetype> t1(){
				return biz.select();
			}
			@GetMapping("select/info/{id}")
			public List<Servicetype> t2(@PathVariable Integer id) {
				return biz.info(id);
			}
			@GetMapping("select/service/{stName}")
			public List<Servicetype> t3(@PathVariable String stName){
				return biz.selectName(stName);
			}
			
			
			
}
