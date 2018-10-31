package com.accp.action.th;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.biz.th.ThBiz;
import com.accp.pojo.Logistics;
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
	public HashMap<Object, Object> SelectLogisticsAndorderID(String userName,String orderID,String orderStatus,String orderType, Integer pageNum, Integer pageSize) {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		PageInfo<Logistics> pageInfo = Biz.SelectLogisticsAndorderID(userName, orderID, orderStatus, orderType, pageNum,
				pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	};

//	// 查看物流详情
//	@GetMapping("querywlxq")
//	public String querywlxq(int logisticsID, Model model, HttpSession session) {
//		Logistics put = Biz.querywlqx(logisticsID);
//		model.addAttribute("PAGE_INFO", put);
//		return "lfxApplay/WlddxqCk";
//	}
//
//	// 修改物流详情
//	@GetMapping("updatewlxq")
//	public String updatewlxq(int auditstatus, int logisticsid, String logisticscompany, String logisticssinglenumber) {
//		Biz.updatewlqx(auditstatus, logisticsid, logisticscompany, logisticssinglenumber);
//		return "redirect:/lfxapply/querywlxq?logisticsID=" + logisticsid;
//	}
//
//	// 查看物流详情
//	@GetMapping("querywu")
//	public String querywu(Integer page, Integer size, String collectgoods, String orderid, Integer auditstatus,
//			Integer delivery, Model model) {
//		if (page == null)
//			page = 1;
//		if (size == null)
//			size = 2;
//		if (collectgoods == null && orderid == null && auditstatus == null && delivery == null) {
//			PageInfo<Logistics> l = Biz.querywu(page, size);
//			model.addAttribute("wu", l);
//		} else if (collectgoods != null || orderid != null || auditstatus != null || delivery != null) {
//			PageInfo<Logistics> l = Biz.querywul(page, size, collectgoods, orderid, auditstatus, delivery);
//			model.addAttribute("wu", l);
//		}
//		model.addAttribute("collectgoods", collectgoods);
//		model.addAttribute("orderid", orderid);
//		model.addAttribute("auditstatus", auditstatus);
//		model.addAttribute("delivery", delivery);
//		return "lfxApplay/Wlddxq";
//	}

}
