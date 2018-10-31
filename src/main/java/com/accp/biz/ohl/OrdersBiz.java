package com.accp.biz.ohl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
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
	public PageInfo<VoOrders> query(String orderID,String userName,String orderStatus,String commentstatus,String refundstatus,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		List<VoOrders> data=dao.query(orderID, userName, orderStatus, commentstatus, refundstatus);
		PageInfo<VoOrders> pageInfo=new PageInfo<VoOrders>(data);
		return pageInfo;
	};
	
	
	/**
	 * 查询订单详情
	 * @param orderID
	 * @return
	 */
	public VoOrders querySee(String orderID) {
		return dao.querySee(orderID);
	};
	
	/**
	 * 审核订单
	 * @param orderID
	 * @param orderStatus
	 * @param remarks
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateSee(String orderID,String orderStatus,String remarks) {
		return dao.updateSee(orderID, orderStatus, remarks);
	};


}
