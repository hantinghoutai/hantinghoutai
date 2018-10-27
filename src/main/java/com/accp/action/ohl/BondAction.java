package com.accp.action.ohl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.biz.ohl.BondBiz;

@Controller
@RequestMapping("/c/ohl/bond")
public class BondAction {
	
	@Autowired
	private BondBiz bondBiz;
	
	@RequestMapping("/userBond")
	@ResponseBody
	public HashMap<Object,Object> userBond(int userID,float goldCoin){
		HashMap<Object,Object> map=new HashMap<Object,Object>();
		bondBiz.bondAdd(userID, goldCoin);
		bondBiz.guaranteeUpdate(userID, goldCoin);
		map.put("code", 200);
		return map;
	}
}
