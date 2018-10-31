package com.accp.action.th;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.biz.th.ThBiz;
import com.accp.pojo.Logistics;
import com.accp.pojo.User;
import com.accp.vo.ohl.VoUserJianding;
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
	public HashMap<Object, Object> queryFuwuAll(String userName, String stid, String serviceTitle, Integer pageNum,
			Integer pageSize) {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		PageInfo<ServiceUserVo> pageInfo = Biz.SelectServiceUserVo(userName, serviceTitle, stid, pageNum, pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	};

	@PostMapping("/queryBBSAll")
	@ResponseBody
	public HashMap<Object, Object> SelectMerchantCollectionUser(String userName, String content, Integer pageNum,
			Integer pageSize) {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		PageInfo<PostCollectionPostCommentVo> pageInfo = Biz.SelectPostCollectionComment(userName, content, pageNum,
				pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	};

	@PostMapping("/queryDianpuAll")
	@ResponseBody
	public HashMap<Object, Object> queryDianpuAll(String userName, String shopName, Integer pageNum, Integer pageSize) {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		PageInfo<MerchantCollectionUserVo> pageInfo = Biz.SelectMerchantCollectionUser(userName, shopName, pageNum,
				pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	};
	
	@PostMapping("/SelectLogisticsAndorderID")
	@ResponseBody
	public HashMap<Object, Object> SelectLogisticsAndorderID(String userName,String orderID,String auditStatus,String delivery, Integer pageNum, Integer pageSize) {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		PageInfo<ServiceUserVo> pageInfo = Biz.SelectLogisticsAndorderID(userName, orderID, auditStatus, delivery, pageNum,
				pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	};
	
	@GetMapping("/QueryLogisticsAndorderID")
	@ResponseBody
	public ServiceUserVo QueryLogisticsAndorderID(String orderid) {
		return Biz.QueryLogisticsAndorderID(orderid);
	};
	
	@PostMapping("/UpdateLogistics")
	@ResponseBody
	public HashMap<Object, Object> UpdateLogistics(@RequestBody ServiceUserVo order) {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		Biz.wuliuzhuangtai(order.getOrderid(), order.getAuditopinion(), order.getAuditstatus());
		if(order.getAuditstatus()==2) {
			Biz.news(order.getUserid(), "您的物流订单【"+order.getOrderid()+"】已被管理员受理！！");
		}else if(order.getAuditstatus()==3) {
			Biz.yue(order.getUserid(), -order.getPrice());
			Biz.jilu(order.getUserid(), -order.getPrice());
			Biz.news(order.getUserid(), "您的物流订单【"+order.getOrderid()+"】已被管理员拒绝！订单金额【"+order.getPrice()+"】已返回您的账户，请注意查收！");
		}
		map.put("code", 200);
		return map;
	}
}
