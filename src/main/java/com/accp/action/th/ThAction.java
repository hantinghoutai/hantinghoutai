package com.accp.action.th;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.biz.th.ThBiz;
import com.accp.pojo.User;
import com.accp.vo.th.MerchantCollectionUserVo;
import com.accp.vo.th.PostCollectionPostCommentVo;
import com.accp.vo.th.ServiceUserVo;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/c/th")
public class ThAction {
	@Autowired
	private ThBiz Biz;
	
	@PostMapping("/queryFuwuAll")
	@ResponseBody
	public HashMap<Object, Object> queryFuwuAll(String userName, String stid,String serviceTitle,Integer pageNum, Integer pageSize){
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		PageInfo<ServiceUserVo> pageInfo=Biz.SelectServiceUserVo(userName, serviceTitle,stid,  pageNum, pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	};
	
	@PostMapping("/queryBBSAll")
	@ResponseBody
	public HashMap<Object, Object> SelectMerchantCollectionUser(String userName, String content,Integer pageNum, Integer pageSize){
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		PageInfo<PostCollectionPostCommentVo> pageInfo=Biz.SelectPostCollectionComment(userName, content, pageNum, pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	};
	
	@PostMapping("/queryDianpuAll")
	@ResponseBody
	public HashMap<Object, Object> queryDianpuAll(String userName, String shopName,Integer pageNum, Integer pageSize){
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		PageInfo<MerchantCollectionUserVo> pageInfo=Biz.SelectMerchantCollectionUser(userName, shopName, pageNum, pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	};
	
	

}
