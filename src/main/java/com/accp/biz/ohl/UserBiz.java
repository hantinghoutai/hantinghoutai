package com.accp.biz.ohl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ohl.IUserDao;
import com.accp.pojo.User;
import com.accp.vo.ohl.VoUserEls;
import com.accp.vo.ohl.VoUserJianding;
import com.accp.vo.ohl.VoUserRuzhu;
import com.accp.vo.ohl.VoUsersj;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("userBiz")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, isolation = Isolation.READ_COMMITTED)
public class UserBiz {
	
	@Autowired
	private IUserDao dao;
	
	/**
	 * 根据用户名查询会员信息
	 * @param userNickName
	 */
	public PageInfo<User> query (String userRealName,int pageNum,int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		List<User> data=dao.query(userRealName);
		PageInfo<User> pageInfo=new PageInfo<User>(data);
		return pageInfo;
	};
	
	/**
	 * 查询需要被导出的会员信息
	 * @param userNickName
	 */
	public List<VoUserEls> queryAll (String userRealName) {
		List<VoUserEls> data=dao.queryAll(userRealName);
		return data;
	};

	/**
	 * 根据会员编号查询会员信息
	 * @param userID
	 */
	public VoUsersj userQuery (String userID) {
		return dao.userQuery(userID);
	};
	
	 /** 后台修改用户信息
	 * @param pojo
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int userUpdate(User pojo) {
		 return dao.userUpdate(pojo);
	};
	
	/**
	 * 修改密码
	 * @param password
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int passwordUpdate(int userid,String password) {
		return dao.passwordUpdate(userid, password);
	};
	
	/**
	 * 查询商家信息
	 * @param userRealName
	 * @param shopName
	 * @param merchantType
	 * @return
	 */
	public PageInfo<User> queryShangjiaAll(String userRealName, String shopName,String merchantType,Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		List<User> data=dao.queryShangjiaAll(userRealName, shopName,merchantType);
		PageInfo<User> pageInfo=new PageInfo<User>(data);
		return pageInfo;
	};
	
	/**
	 * 查询商家信息
	 * @param userRealName
	 * @param shopName
	 * @param merchantType
	 * @return
	 */
	public List<User> queryShangjiaAlls(String userRealName, String shopName,String merchantType){
		List<User> data=dao.queryShangjiaAll(userRealName, shopName,merchantType);
		return data;
	};
	
	/**
	 * 修改商家信息
	 * @param pojo
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateShangjiaAll(User pojo) {
		return dao.updateShangjiaAll(pojo);
	};
	
	/**
	 * 查询入驻商家
	 * @param userRealName
	 * @param auditStatus
	 * @param merchantType
	 * @return
	 */
	public PageInfo<VoUserRuzhu> queryRuzhuAll(String userName,String auditStatus,String merchantType,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		List<VoUserRuzhu> data=dao.queryRuzhuAll(userName,auditStatus,merchantType);
		PageInfo<VoUserRuzhu> pageInfo=new PageInfo<VoUserRuzhu>(data);
		return pageInfo;
	};
	
	/**
	 * 入驻商家导出表格
	 * @param userName
	 * @param auditStatus
	 * @param merchantType
	 * @return
	 */
	public List<VoUserRuzhu> queryRuzhuAlls(String userName,String auditStatus,String merchantType){
		return dao.queryRuzhuAll(userName,auditStatus,merchantType);
	};
	
	/**
	 * 查询商家入驻详细信息
	 * @param userID
	 * @return
	 */
	public VoUserRuzhu queryRuzhuSee(String userID) {
		return dao.queryRuzhuSee(userID);
	};
	
	/**
	 * 审核用商家入驻
	 * @param auditStatus
	 * @param merchantType
	 * @param reason
	 * @param userID
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateShangjiaSee(String auditStatus ,String merchantType,String reason,String userID) {
		return dao.updateShangjiaSee(auditStatus, merchantType, reason, userID);
	};

	/**
	 * 查询商家鉴定申请
	 * @param name
	 * @param auditStatus
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<VoUserJianding> queryJianding(String userName,String auditStatus,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		List<VoUserJianding> data=dao.queryJianding(userName,auditStatus);
		PageInfo<VoUserJianding> pageInfo=new PageInfo<VoUserJianding>(data);
		return pageInfo;
	};
	
	/** 
	 * 查询商家鉴定申请详细信息
	 * @param applyID
	 * @return
	 */
	public VoUserJianding queryJiandingSee(String applyID) {
		return dao.queryJiandingSee(applyID);
	};
	
	/**
	 * 审核商检鉴定申请
	 * @param adminOpinion
	 * @param auditStatus
	 * @param applyID
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateJiandingSee(String adminOpinion,String auditStatus,String applyID) {
		return dao.updateJiandingSee(adminOpinion, auditStatus, applyID);
	};
	

	/**
	 * 插叙属于用户的第几服务
	 * @param stid
	 * @param userID
	 * @return
	 */
	public String selectfirstServiceID(String stid,String userID) {
		return dao.selectfirstServiceID(stid, userID);
	};
	
	/**
	 * 通过cation判断给第几服务修改鉴定状态
	 * @param cation
	 * @param bool
	 * @param userID
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateUserCation(String cation,boolean bool,String userID) {
		return dao.updateUserCation(cation, bool, userID);
	};
}
