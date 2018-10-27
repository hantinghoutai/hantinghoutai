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

import com.accp.biz.clm.BankBiz;
import com.accp.dao.clm.IBank;
import com.accp.pojo.Banktype;

@RestController
@RequestMapping("/clm/api")
public class BankAction {

	@Autowired
	private BankBiz biz;
	
	@GetMapping("/selectBankInfo")
	public List<Banktype> selectBankInfo(){
		return biz.selectBankInfo();
	}
	
	@PostMapping("/addBank")
	public Map<String, String> addBank(@RequestBody Banktype bank) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("code", "200");
		biz.addBank(bank);
		return map;
	}
	
	@DeleteMapping("/deleteBank/{bankId}")
	public Map<String, String> deleteBank(@PathVariable Integer bankId) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("code", "200");
		biz.deleteBank(bankId);
		return map;
	}
	
	@PutMapping("/updateBank")
	public Map<String, String> updateBank(@RequestBody Banktype bank) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("code", "200");
		biz.updateBank(bank);
		return map;
	}
	
	@GetMapping("/selectBank/{bankId}")
	public Banktype selectBank(@PathVariable Integer bankId) {
		return biz.selectBank(bankId);
	}

}
