package com.accp.dao.th;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Logistics;
import com.accp.vo.ohl.VoUserJianding;
import com.accp.vo.th.MerchantCollectionUserVo;
import com.accp.vo.th.PostCollectionPostCommentVo;
import com.accp.vo.th.ServiceUserVo;

public interface ITHDao {
	/***
	 * 服务收藏+模糊查
	 * @return
	 */
	public List<ServiceUserVo> SelectServiceUserVo(@Param("userName")String userName,@Param("serviceTitle")String serviceTitle,@Param("stid")String stid);

	/***
	 * BBS论坛
	 * @param userName
	 * @param serviceTitle
	 * @param stid
	 * @return
	 */
	public List<PostCollectionPostCommentVo> SelectPostCollectionComment(@Param("userName")String userName,@Param("content")String content);

	/***
	 * 店铺收藏
	 * @param userName
	 * @param serviceTitle
	 * @param stid
	 * @return
	 */
	public List<MerchantCollectionUserVo> SelectMerchantCollectionUser(@Param("userName")String userName,@Param("shopName")String shopName);

	/***
	 * 物流订单详情
	 * @param userName
	 * @param serviceTitle
	 * @param stid
	 * @return
	 */
	public List<ServiceUserVo> SelectLogisticsAndorderID(@Param("userName")String userName,@Param("orderID")String orderID,@Param("auditStatus")String auditStatus,@Param("delivery")String delivery);

	public ServiceUserVo QueryLogisticsAndorderID(@Param("orderid")String orderid);
	
	/**
	 * 修改物流详情
	 * @param logisticsid
	 * @param auditstatus
	 * @param logisticscompany
	 * @param logisticssinglenumber
	 * @return
	 */
	public int updatewlqx(@Param("logisticsid") int logisticsid,@Param("auditstatus") int auditstatus,@Param("logisticscompany") String logisticscompany,@Param("logisticssinglenumber") String logisticssinglenumber);

	
	/**
	 * 修改物流状态
	 * @param orderID
	 * @param auditOpinion
	 * @param integer
	 * @return
	 */
	public int wuliuzhuangtai(@Param("orderID")String orderID,@Param("auditOpinion")String auditOpinion,@Param("auditStatus")Integer auditStatus);
	/**
	 * 物流订单拒绝后 将钱退还给用户
	 * @param integer
	 * @param money
	 * @return
	 */
	public int yue(@Param("userID")Integer userID,@Param("money")float money);
	/**
	 * 将余额退还记录记录
	 * @param userID
	 * @param money
	 * @return
	 */
	public int jilu(@Param("userID")Integer userID,@Param("money")float money);
	/**
	 * 审批物流订单后 发送站内信
	 * @param userID
	 * @param text
	 * @return
	 */
	public int news(@Param("userID")Integer userID,@Param("text")String text);
}
