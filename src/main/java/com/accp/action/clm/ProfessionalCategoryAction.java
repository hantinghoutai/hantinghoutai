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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.clm.ProfessionalCategoryBiz;
import com.accp.dao.clm.ProfessionalCategoryDao;
import com.accp.pojo.Majortype;


@RestController
@RequestMapping("/clm/api")
public class ProfessionalCategoryAction {

	@Autowired
	private ProfessionalCategoryBiz biz;
	
	
	@GetMapping("/selectLanguageType")
	public List<Majortype> selectLanguageType(){
		return biz.selectLanguageType();
	}
	
	@PostMapping("/addLanguageType")
	public Map<String, String> addLanguageType(@RequestBody Majortype la) {
		Map<String, String> map=new HashMap<String, String>();
		biz.addLanguageType(la);
		map.put("code","200");
		return map;
	}
	@PutMapping("/updateLanguageType")
	public Map<String, String> updateLanguageType(@RequestBody Majortype la) {
		Map<String, String> map=new HashMap<String, String>();
		biz.updateLanguageType(la);
		map.put("code","200");
		return map;
	}
	@GetMapping("/selectMajortypeInfo/{id}")
	public Majortype selectMajortypeInfo(@PathVariable String id) {
		return biz.selectMajortypeInfo(id);
	}
	@GetMapping("/selectType")
	public List<Majortype> selectType(){
		return biz.selectType();
				
	}

}
