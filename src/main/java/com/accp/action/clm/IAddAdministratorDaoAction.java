package com.accp.action.clm;

import java.net.InetAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.clm.IAddAdministratorBiz;

@RestController
@RequestMapping("/clm/api")
public class IAddAdministratorDaoAction {

	@Autowired
	private IAddAdministratorBiz biz;
	
	@GetMapping("/addAddAdministratorinfo/{adminID}/{remarks}")
	public int addAddAdministratorinfo(@PathVariable Integer adminID,@PathVariable String remarks)throws Exception {
		InetAddress address = InetAddress.getLocalHost();
		String hostAddress1 = address.getHostAddress();
		return biz.addAddAdministratorinfo(adminID, remarks, hostAddress1);
	}

}
