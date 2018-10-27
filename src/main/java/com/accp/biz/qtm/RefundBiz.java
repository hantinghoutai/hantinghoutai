package com.accp.biz.qtm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.qtm.IRefundDao;
import com.accp.vo.qtm.Refund;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class RefundBiz {
			@Autowired
			private IRefundDao dao;
			
			public List<Refund>  select (){
				return dao.list();
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
}
