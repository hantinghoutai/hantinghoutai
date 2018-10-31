package com.accp.action.clm;

import java.net.InetAddress;
import java.net.UnknownHostException;
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

import com.accp.biz.clm.AdminBiz;
import com.accp.pojo.Admin;
import com.accp.vo.clm.AdminVo;


@RestController
@RequestMapping("/clm/api")
public class AdminAction {
	
	@Autowired
	private AdminBiz biz;
	
	@GetMapping("/selectUserInfo")
	public List<Admin> selectUserInfo(){
		return biz.selectUserInfo();
	}
	
	
	@PostMapping("/insertUser")
	public Map<String, String> insertUser(@RequestBody Admin admin) throws UnknownHostException {
		Map<String, String> map=new HashMap<String, String>();
		InetAddress address = InetAddress.getLocalHost();
		String hostAddress = address.getHostAddress();
		admin.setCreationip(hostAddress);
		biz.insertUser(admin);
		map.put("code","200");
		return map;
	}
	
	@GetMapping("/selectUserInfoOne/{name}")
	public int selectUserInfos(@PathVariable String name) {
		return biz.selectUserInfos(name);
	}
	
	@PutMapping("updateAdmin")
	public Map<String, String> updateAdmin(@RequestBody Admin admin) throws UnknownHostException {
		Map<String, String> map=new HashMap<String, String>();
		InetAddress address = InetAddress.getLocalHost();
		String hostAddress1 = address.getHostAddress();
		admin.setCreationip(hostAddress1);
		biz.updateAdmin(admin);
		map.put("code","200");
		return map;
	}
	
	@GetMapping("selectAdminInfo/{id}")
	public AdminVo selectAdminInfo(@PathVariable Integer id) {
		return biz.selectAdminInfo(id);
	}
	
	
	@DeleteMapping("deleteAdmin/{id}")
	public Map<String, String> deleteAdmin(@PathVariable Integer id) {
		Map<String, String> map=new HashMap<String, String>();
		biz.deleteAdmin(id);
		map.put("code","200");
		return map;
	}

}
