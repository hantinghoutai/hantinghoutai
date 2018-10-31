package com.accp.biz.lfxBiz;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lfxDao.AppraisalapplyDao;
import com.accp.pojo.Goldnotes;
import com.accp.pojo.User;
import com.accp.vo.lfx.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AppraisalapplyBiz {
	@Autowired
	private AppraisalapplyDao dao;

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public PageInfo<AppraisalapplyVo> findAppraisalapplyVo(String userName,Integer auditStatus,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<AppraisalapplyVo>(dao.queryapplyVo(userName, auditStatus));
	}
	public void modifyapply(Integer auditStatus,Integer applyID) {
		dao.modifyapply(auditStatus,applyID);
	}
	public AppraisalapplyVo queryapplyVox(Integer applyID){
		AppraisalapplyVo vo=dao.queryapplyVox(applyID);
		return vo;
	}
	//商家入驻
	public PageInfo<User> findShoppingentry(String userName,Integer merchantType,Integer auditStatus,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<User>(dao.queryShoppentry(userName, merchantType,auditStatus));
	}
	//查看鉴定详情
	public User querentryx(Integer userid){
		User user=dao.queryentryx(userid);		
		return user;
	}
	//提现申请
	public PageInfo<PutforwardrecordVo> findtixian(String userName,String auditStatus,Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<PutforwardrecordVo>(dao.querytixian(userName,auditStatus));
	}
	//查看提现详情
	public PutforwardrecordVo querytixianx(String pfID) {
		PutforwardrecordVo tixvo=dao.querytixianx(pfID);
		return tixvo;
	}
	//查看帖子
	public PageInfo<PostVo> findpost(String fName,String title,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		return new  PageInfo<PostVo>(dao.querypost(fName, title));
		
	}
	//查看帖子详情
	public PostVo querypostx(Integer postID) {
		PostVo postvo=dao.querypostx(postID);
		return postvo;
	}
	//修改帖子
	public void modifypost( Integer auditStatus, Integer operatingState, String adminOpinion, Integer postID) {
		dao.modifypost(auditStatus, operatingState, adminOpinion, postID);
	}
	//删除帖子
	public void removepost( Integer [] postid) {
		dao.removepost(postid);
	}
	//查看帖子板块
	public PageInfo<tiezibankuai> findpostbankuai(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		return new  PageInfo<tiezibankuai>(dao.querypostbankuai());
		
	}
	//删除帖子板块管理
	public void removepostbankuai(Integer fmID) {
		dao.removepostbankuai(fmID);
	}
	//删除帖子板块的时候删除帖子
//	public void removepostbankuait(Integer postID) {
//		dao.removepostbankuait(postID);
//	}
	//查看帖子投诉
	public List<tizitousu> querypostt(){
		return dao.querytiezit();
	}
	//删除帖子投诉
	public void removetizit(Integer cid) {
		dao.removepostt(cid);
	}
	//查看金币
	public PageInfo<GoldsRecord> querygolds(String userName, String userID,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<GoldsRecord>(dao.querygolds(userName,userID));
	}
	//查看金币详情
	public PutforwardrecordVo querygoldsx(Integer userID) {
		return dao.querygodlsx(userID);
	}
	//修改提现

	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int modifytixian(String pfID,String auditStatus,String adminOpinion) {
		return dao.modifytixian(pfID,auditStatus,adminOpinion);
	}
	//提现成功后 修改用户金币余额
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int xiugaijinbi(String pfID) {
		return dao.xiugaijinbi(pfID);
	}
	//提现成功后新增金币提现记录
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int tixianjilu(String pfID) {
		return dao.tixianjilu(pfID);
	}
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	 public int zhanneixin( String pfID,String text) {
		return dao.zhanneixin(pfID, text);
	};
	public PageInfo<RecordVo> queryRecharge(String userName,String userID,String acquisitionMode,String auditStatus,Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<RecordVo>(dao.queryRecharge(userName,userID,acquisitionMode,auditStatus));
	}
	public boolean updateForward(String recordID,String auditStatus) {
		return dao.updateForward( recordID, auditStatus);
	}
	public Goldnotes queryForward(String recordID) {
		return dao.queryForward(recordID);
	}
	
}
