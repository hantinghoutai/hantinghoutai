package com.accp.dao.ohl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.ohl.VoOrders;

public interface IOrdersDao {
	/**
	 * 查询订单信息
	 * @param orderID
	 * @param userName
	 * @param orderStatus
	 * @param commentstatus
	 * @param refundstatus
	 * @return
	 */
	List<VoOrders> query(@Param("orderID")String orderID,@Param("userName")String userName,@Param("orderStatus")String orderStatus,@Param("commentstatus")String commentstatus,@Param("refundstatus")String refundstatus);
	
	/**
	 * 查询订单详情
	 * @param orderID
	 * @return
	 */
	VoOrders querySee(@Param("orderID")String orderID);
	
	/**
	 * 审核订单
	 * @param orderID
	 * @param orderStatus
	 * @param remarks
	 * @return
	 */
	int updateSee(@Param("orderID")String orderID,@Param("orderStatus") String orderStatus,@Param("remarks") String remarks);
}
