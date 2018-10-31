package com.accp.action.ohl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
}
