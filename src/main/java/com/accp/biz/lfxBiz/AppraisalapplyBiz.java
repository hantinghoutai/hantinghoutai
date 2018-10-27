package com.accp.biz.lfxBiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lfxDao.AppraisalapplyDao;
import com.accp.pojo.User;
import com.accp.vo.lfx.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AppraisalapplyBiz {
	@Autowired
	private AppraisalapplyDao dao;
//	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
//	public PageInfo<Appraisalapply> findAppraisalapply(Integer userid,Integer auditstatus,Integer pageNum,Integer pageSize){
//		PageHelper.startPage(pageNum,pageSize);
//		return new PageInfo<Appraisalapply>(dao.queryapply(userid,auditstatus));
//	}
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
	public PageInfo<PutforwardrecordVo> findtixian(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<PutforwardrecordVo>(dao.querytixian());
	}
	//查看提现详情
	public PutforwardrecordVo querytixianx(Integer pfrID) {
		PutforwardrecordVo tixvo=dao.querytixianx(pfrID);
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
	public PageInfo<GoldsRecord> querygolds(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<GoldsRecord>(dao.querygolds());
	}
	//查看金币详情
	public PutforwardrecordVo querygoldsx(Integer userID) {
		return dao.querygodlsx(userID);
	}
	//修改提现1
	public void modifytixian(Integer auditStatus,Integer pfID) {
		dao.modifytixian(auditStatus, pfID);
	}
	public PageInfo<RecordVo> queryRecharge(Integer pageNum, Integer pageSize,String userName){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<RecordVo>(dao.queryRecharge(userName));
	}
	public boolean updateForward(ForwardVo vo,String Time) {
		return dao.updateForward(vo,Time);
	}
	public ForwardVo queryForward(int userID) {
		return dao.queryForward(userID);
	}
	
}
