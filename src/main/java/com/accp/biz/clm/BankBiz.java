package com.accp.biz.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.clm.IBank;
import com.accp.pojo.Banktype;

@Service("Bank")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class BankBiz {
	@Autowired
	private IBank dao;
	
	
	public List<Banktype> selectBankInfo(){
		return dao.selectBankInfo();
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addBank(Banktype bank) {
		dao.addBank(bank);
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void deleteBank(Integer bankId) {
		dao.deleteBank(bankId);
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void updateBank(Banktype bank) {
		dao.updateBank(bank);
	}
	public Banktype selectBank(Integer bankId) {
		return dao.selectBank(bankId);
	}

}
