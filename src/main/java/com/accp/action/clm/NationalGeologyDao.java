package com.accp.action.clm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.clm.NationalGeologyBiz;
import com.accp.dao.clm.INationalGeology;
import com.accp.pojo.Sharea;

@RestController
@RequestMapping("/clm/api")
public class NationalGeologyDao {

	@Autowired
	private NationalGeologyBiz biz;
	
	@GetMapping("/selectShareaGu/{areaId}")
	public List<Sharea> selectShareaGu(@PathVariable String areaId){
		return biz.selectShareaGu(areaId);
	}
	//查看
	@GetMapping("/selectShareaG/{areaId}")
	public List<Sharea> selectShareaG(@PathVariable String areaId){
		return biz.selectShareaG(areaId);
	}
	//新增国
	@PostMapping("/addShareaG")
	public Map<String, String> addShareaG(@RequestBody Sharea sharea) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("code", "200");
		biz.addShareaG(sharea);
		return map;
	}
	//新增省
	@PostMapping("/addSharea")
	public Map<String, String> addSharea(@RequestBody Sharea sharea) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("code", "200");
		biz.addSharea(sharea);
		return map;
	}
	//修改
	@PutMapping("/updateSharea")
	public Map<String, String> updateSharea(@RequestBody Sharea sharea) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("code", "200");
		biz.updateSharea(sharea);
		return map;
	}
	//删除
	@DeleteMapping("/deleteSharea/{areaId}")
	public Map<String, String> deleteSharea(@PathVariable String areaId) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("code", "200");
		String[] aidd=areaId.split(",");
		biz.deleteSharea(aidd);
		return map;
	}
	@GetMapping("/selectSharea/{areaID}")
	public Sharea selectSharea(@PathVariable Integer areaID) {
		return biz.selectSharea(areaID);
	}
}
