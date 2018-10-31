package com.accp.biz.qtm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.qtm.IRefundDao;
import com.accp.vo.qtm.ExamineAndApprove;
import com.accp.vo.qtm.Refund;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class RefundBiz {
			@Autowired
			private IRefundDao dao;
			
			public PageInfo<Refund>  select (int a,int b){
				PageHelper.startPage(a, b);
				List<Refund> list=dao.list();
				PageInfo<Refund> fenye=new PageInfo<Refund>(list);
				return fenye;
			}
			public int panduan(int refundID) {
				return dao.pan(refundID);
			}
			public Refund listinfo(int refundID) {
				return dao.listinfo(refundID);
			}
			@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
			public int update(int adminStatus, int refundID,int ActualRefundMoney) {
				return dao.updates(adminStatus, refundID, ActualRefundMoney);
			}
			@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
			public int updates(int adminStatus, int refundID,String adminRemarks) {
				return dao.updatess(adminStatus, refundID, adminRemarks);
			}
			@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
			public int datele(String id) {
				return dao.deletes(id);
			}
			public int userid(String userName) {
				return dao.userID(userName);
			}
			public int sid(int orderID) {
				return dao.sid(orderID);
			}
			@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
			public int supdate(int  sid,int  userMoney) {
				return dao.supdate(sid, userMoney);
			}
			@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
			public int uupdate(int  userid,int  userMoney) {
				return dao.yupdate(userid, userMoney);
			}
			@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
			public int jiajilu(int  userid,float userMoney) {
				return dao.jilu(userid, userMoney);
			}
}
