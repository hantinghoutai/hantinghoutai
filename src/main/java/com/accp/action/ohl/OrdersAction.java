package com.accp.action.ohl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.biz.ohl.OrdersBiz;
import com.accp.vo.ohl.VoOrders;
import com.github.pagehelper.PageInfo;
@Controller
@RequestMapping("/c/ohl/orders")
public class OrdersAction {
	
	@Autowired
	private OrdersBiz ordersBiz;
	
	/**
	 * 查询订单
	 * @param orderID
	 * @param userName
	 * @param orderStatus
	 * @param commentstatus
	 * @param refundstatus
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@PostMapping("/query")
	@ResponseBody
	public HashMap<Object, Object> query(String orderID,String userName,String orderStatus,String commentstatus,String refundstatus,Integer pageNum,Integer pageSize){
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		PageInfo<VoOrders> pageInfo=ordersBiz.query(orderID, userName, orderStatus, commentstatus, refundstatus, pageNum, pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	};
	
	/**
	 * 查询订单详情
	 * @param orderID
	 * @return
	 */
	@GetMapping("/querySee")
	@ResponseBody
	public VoOrders querySee(String orderID) {
		return ordersBiz.querySee(orderID);
	};
	
	/**
	 * 审核订单(后台无用，只用于前台商家审批)
	 * @param orderID
	 * @param orderStatus
	 * @param remarks
	 * @return
	 */
	@PostMapping("/update")
	@ResponseBody
	public int updateSee(String orderID,String orderStatus,String remarks) {
		return ordersBiz.updateSee(orderID, orderStatus, remarks);
	};
}
