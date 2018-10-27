package com.accp.biz.th;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.th.ITHDao;
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
	 * @param userRealName
	 * @param shopName
	 * @param merchantType
	 * @return
	 */
	public PageInfo<ServiceUserVo> SelectServiceUserVo(String userName,String serviceTitle, String stid,Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		List<ServiceUserVo> data=dao.SelectServiceUserVo(userName, serviceTitle,stid);
		PageInfo<ServiceUserVo> pageInfo=new PageInfo<ServiceUserVo>(data);
		return pageInfo;
	};
	
	public PageInfo<PostCollectionPostCommentVo> SelectPostCollectionComment(String userName,String content,Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		List<PostCollectionPostCommentVo> data=dao.SelectPostCollectionComment(userName, content);
		PageInfo<PostCollectionPostCommentVo> pageInfo=new PageInfo<PostCollectionPostCommentVo>(data);
		return pageInfo;
	};
	
	public PageInfo<MerchantCollectionUserVo> SelectMerchantCollectionUser(String userName,String shopName,Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		List<MerchantCollectionUserVo> data=dao.SelectMerchantCollectionUser(userName, shopName);
		PageInfo<MerchantCollectionUserVo> pageInfo=new PageInfo<MerchantCollectionUserVo>(data);
		return pageInfo;
	};

}
