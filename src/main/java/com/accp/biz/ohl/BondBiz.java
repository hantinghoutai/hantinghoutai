package com.accp.biz.ohl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ohl.IBondDao;

@Service("bondBiz")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, isolation = Isolation.READ_COMMITTED)
public class BondBiz {
	
	@Autowired
	private IBondDao dao;
	
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int guaranteeUpdate(int userID,float guaranteeMoney) {
		return dao.guaranteeUpdate(userID, guaranteeMoney);
	};
	
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int bondAdd(int userID,float goldCoin) {
		return dao.bondAdd(userID, goldCoin);
	};
}
