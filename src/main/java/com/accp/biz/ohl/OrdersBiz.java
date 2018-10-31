package com.accp.biz.ohl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ohl.IOrdersDao;
import com.accp.vo.ohl.VoOrders;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("ordersBiz")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, isolation = Isolation.READ_COMMITTED)
public class OrdersBiz {
	
	@Autowired
	private IOrdersDao dao;
	
	public PageInfo<VoOrders> query(String orderID,String userName,String orderStatus,String commentstatus,String refundstatus,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		List<VoOrders> data=dao.query(orderID, userName, orderStatus, commentstatus, refundstatus);
		PageInfo<VoOrders> pageInfo=new PageInfo<VoOrders>(data);
		return pageInfo;
	};
	
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int update(String orderID,String orderStatus){
		return 0;
	};

}
