package com.accp.dao.th;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Logistics;
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
	public List<Logistics> SelectLogisticsAndorderID(@Param("userName")String userName,@Param("orderID")String orderID,@Param("orderStatus")String orderStatus,@Param("orderType")String orderType);

	//修改物流详情
	public int updatewlqx(@Param("logisticsid") int logisticsid,@Param("auditstatus") int auditstatus,@Param("logisticscompany") String logisticscompany,@Param("logisticssinglenumber") String logisticssinglenumber);

}
