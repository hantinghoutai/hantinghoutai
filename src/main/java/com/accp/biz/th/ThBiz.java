package com.accp.biz.th;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.th.ITHDao;
import com.accp.pojo.Logistics;
import com.accp.pojo.User;
import com.accp.vo.th.MerchantCollectionUserVo;
import com.accp.vo.th.PostCollectionPostCommentVo;
import com.accp.vo.th.ServiceUserVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("ThBiz")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, isolation = Isolation.READ_COMMITTED)
public class ThBiz {

	@Autowired
	private ITHDao dao;

	/**
	 * 查询商家信息
	 * 
	 * @param userRealName
	 * @param shopName
	 * @param merchantType
	 * @return
	 */
	public PageInfo<ServiceUserVo> SelectServiceUserVo(String userName, String serviceTitle, String stid,
			Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<ServiceUserVo> data = dao.SelectServiceUserVo(userName, serviceTitle, stid);
		PageInfo<ServiceUserVo> pageInfo = new PageInfo<ServiceUserVo>(data);
		return pageInfo;
	};

	public PageInfo<PostCollectionPostCommentVo> SelectPostCollectionComment(String userName, String content,
			Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<PostCollectionPostCommentVo> data = dao.SelectPostCollectionComment(userName, content);
		PageInfo<PostCollectionPostCommentVo> pageInfo = new PageInfo<PostCollectionPostCommentVo>(data);
		return pageInfo;
	};

	public PageInfo<MerchantCollectionUserVo> SelectMerchantCollectionUser(String userName, String shopName,
			Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<MerchantCollectionUserVo> data = dao.SelectMerchantCollectionUser(userName, shopName);
		PageInfo<MerchantCollectionUserVo> pageInfo = new PageInfo<MerchantCollectionUserVo>(data);
		return pageInfo;
	};

	//物流
	public PageInfo<ServiceUserVo> SelectLogisticsAndorderID(String userName,String orderID,String auditStatus,String delivery,
			Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<ServiceUserVo> data = dao.SelectLogisticsAndorderID(userName, orderID, auditStatus, delivery);
		PageInfo<ServiceUserVo> pageInfo = new PageInfo<ServiceUserVo>(data);
		return pageInfo;
	};
	
	//详情
	public ServiceUserVo QueryLogisticsAndorderID(String orderid){
		return dao.QueryLogisticsAndorderID(orderid);
	}
	
	// 修改物流详情
	public int updatewlqx(int auditstatus, int logisticsid, String logisticscompany, String logisticssinglenumber) {
		return dao.updatewlqx(logisticsid, auditstatus, logisticscompany, logisticssinglenumber);
	}

	/**
	 * 修改物流状态
	 * @param orderID
	 * @param auditOpinion
	 * @param integer
	 * @return
	 */
	public int wuliuzhuangtai(String orderID,String auditOpinion,Integer auditStatus) {
		return dao.wuliuzhuangtai(orderID, auditOpinion, auditStatus);
	};
	/**
	 * 物流订单拒绝后 将钱退还给用户
	 * @param integer
	 * @param money
	 * @return
	 */
	public int yue(Integer userID,float money) {
		return dao.yue(userID, money);
	};
	/**
	 * 将余额退还记录记录
	 * @param userID
	 * @param money
	 * @return
	 */
	public int jilu(Integer userID,float money) {
		return dao.jilu(userID, money);
	};
	/**
	 * 审批物流订单后 发送站内信
	 * @param userID
	 * @param text
	 * @return
	 */
	public int news(Integer userID,String text) {
		return dao.news(userID, text);
	}
}
