package com.accp.action.clm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.clm.ServiceCostBiz;
import com.accp.dao.clm.IServiceCostDao;
import com.accp.pojo.Servicecosttype;
import com.accp.pojo.Servicetype;
import com.accp.vo.clm.ServiceCostVo;


@RestController
@RequestMapping("/clm/api")
public class ServiceCostAction {

	@Autowired
	private ServiceCostBiz biz;

	
	@GetMapping("/selectServiceCostInfo/{stid}")
	public List<ServiceCostVo> selectServiceCostInfo(@PathVariable String stid){
		return biz.selectServiceCostInfo(stid);
	}
	
	//查詢下拉框
	@GetMapping("/selectServicetypeInfo")
	public List<Servicetype> selectServicetypeInfo(){
		return biz.selectServicetypeInfo();
	}
	
	@PostMapping("/addServicetype")
	public Map<String, String> addServicetype(@RequestBody Servicecosttype servicecosttype) {
		Map<String, String> map=new HashMap<String, String>();
		System.out.println(servicecosttype.getStid()+""+servicecosttype.getServicecosttypename());
		map.put("code", "200");
		biz.addServicetype(servicecosttype);
		return map;
	}
	
	@DeleteMapping("/deleteServicetype/{stid}")
	public Map<String, String> deleteServicetype(@PathVariable Integer stid) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("code", "200");
		biz.deleteServicetype(stid);
		return map;
	}
	
	@PutMapping("/updateServicetype")
	public Map<String, String> updateServicetype(@RequestBody Servicecosttype servicecosttype) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("code", "200");
		System.out.println("666666666"+servicecosttype.getStid()+"hah");
		biz.updateServicetype(servicecosttype);
		return map;
	}
	
	@GetMapping("/selectServicecosttype/{stid}")
	public Servicecosttype selectServicecosttype(@PathVariable Integer stid) {
		return biz.selectServicecosttype(stid);
	}

}
