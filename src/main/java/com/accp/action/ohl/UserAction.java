package com.accp.action.ohl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.biz.ohl.BondBiz;
import com.accp.biz.ohl.UserBiz;
import com.accp.pojo.User;
import com.accp.utils.MD5Signature;
import com.accp.vo.ohl.VoUserEls;
import com.accp.vo.ohl.VoUserJianding;
import com.accp.vo.ohl.VoUserRuzhu;
import com.accp.vo.ohl.VoUsersj;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/c/ohl/user")
public class UserAction {
	
	@Autowired
	private UserBiz userBiz;
	@Autowired
	private BondBiz bondBiz;
	
	@PostMapping("/query")
	@ResponseBody
	public HashMap<Object, Object> query(String userRealName, Integer pageNum, Integer pageSize) {
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		PageInfo<User> pageInfo=userBiz.query(userRealName, pageNum, pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	}
	
	@PostMapping("/queryAll")
	@ResponseBody
	public List<VoUserEls> queryAll(String userRealName) {
		return userBiz.queryAll(userRealName);
	}
	
	@GetMapping("/userQuery")
	@ResponseBody
	public VoUsersj userQuery(String userID) {
		return userBiz.userQuery(userID);
	}
	
	@PostMapping("/userUpdate")
	@ResponseBody
	public HashMap<Object,Object> userUpdate(String user,String password) {
		HashMap<Object,Object> map=new HashMap<Object,Object>();
		User obj=JSON.parseObject(user, User.class);
		userBiz.userUpdate(obj);				//修改用户信息
		if(obj.getMailboxverification()) {		//判断邮箱是否激活
			try {
				userBiz.passwordUpdate(obj.getUserid(), MD5Signature.md5(password));
				map.put("code", 200);
			} catch (Exception e) {
				map.put("code", 400);
			}//修改密码
		}
		return map;
	}

	@PostMapping("/queryShangjiaAll")
	@ResponseBody
	public HashMap<Object, Object> queryShangjiaAll(String userName, String shopName,String merchantType,Integer pageNum, Integer pageSize){
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		PageInfo<User> pageInfo=userBiz.queryShangjiaAll(userName, shopName, merchantType, pageNum, pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	};
	
	@PostMapping("/queryShangjiaAlls")
	@ResponseBody
	/**
	 * 导出
	 * @param userRealName
	 * @param shopName
	 * @param merchantType
	 * @return
	 */
	public List<User> queryShangjiaAlls(String userName, String shopName,String merchantType){
		return userBiz.queryShangjiaAlls(userName, shopName, merchantType);
	};
	
	@PostMapping("/updateShangjiaAll")
	@ResponseBody
	public HashMap<Object,Object> updateShangjiaAll(String user,String password,float goldCoin) {
		HashMap<Object,Object> map=new HashMap<Object,Object>();
		User obj=JSON.parseObject(user, User.class);
		if(obj.getMailboxverification()) {			//判断邮箱是否激活，修改密码
			try {
				userBiz.updateShangjiaAll(obj);
				userBiz.passwordUpdate(obj.getUserid(), MD5Signature.md5(password));
				if(goldCoin!=obj.getGuaranteemoney()) {		//修改保证金
					bondBiz.bondAdd(obj.getUserid(), goldCoin);
					bondBiz.guaranteeUpdate(obj.getUserid(), goldCoin);
				}
				map.put("code", 200);	
			} catch (Exception e) {
				map.put("code", 400);
			}
		}
		return map; 
	}
	
	@PostMapping("/queryRuzhuAll")
	@ResponseBody
	public HashMap<Object, Object> queryRuzhuAll(String userName,String auditStatus,String merchantType,Integer pageNum,Integer pageSize){
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		PageInfo<VoUserRuzhu> pageInfo=userBiz.queryRuzhuAll(userName, auditStatus, merchantType, pageNum, pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	}
	
	@PostMapping("/queryRuzhuAlls")
	@ResponseBody
	public List<VoUserRuzhu> queryRuzhuAlls(String userName,String auditStatus,String merchantType){
		return userBiz.queryRuzhuAlls(userName, auditStatus, merchantType);
	}
	
	@GetMapping("/queryRuzhuSee")
	@ResponseBody
	public VoUserRuzhu queryRuzhuSee(String userID) {
		return userBiz.queryRuzhuSee(userID);
	};
	
	@PostMapping("/updateShangjiaSee")
	@ResponseBody
	public HashMap<Object,Object> updateShangjiaSee(String auditStatus,String merchantType,String reason,String userID) {
		int count=userBiz.updateShangjiaSee(auditStatus, merchantType, reason, userID);
		HashMap<Object,Object> map=new HashMap<Object,Object>();
		if(count>0) {
			map.put("code", 200);
		}
		return map; 
	};
	
	
	@PostMapping("/queryJianding")
	@ResponseBody
	public HashMap<Object, Object> queryJianding(String userName,String auditStatus,Integer pageNum,Integer pageSize){
		System.out.println("userName:"+userName+" auditStatus:"+auditStatus);
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		PageInfo<VoUserJianding> pageInfo=userBiz.queryJianding(userName, auditStatus, pageNum, pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	}
	
	@GetMapping("/queryJiandingSee")
	@ResponseBody
	public VoUserJianding queryJiandingSee(String applyID) {
		return userBiz.queryJiandingSee(applyID);
	};
	
	@PostMapping("/updateJiandingSee")
	@ResponseBody
	public HashMap<Object,Object> updateJiandingSee(String userID,String stid,String adminOpinion,String auditStatus,String applyID){
		HashMap<Object,Object> map=new HashMap<Object,Object>();
		int count=userBiz.updateJiandingSee(adminOpinion, auditStatus, applyID);
		if(count>0) {
			String cation=userBiz.selectfirstServiceID(stid, userID);
			userBiz.updateUserCation(cation, auditStatus.equals("2")?true:false, userID);
			map.put("code", 200);
		}else {
			map.put("code", 400);
		}
		return map;
	}
}
