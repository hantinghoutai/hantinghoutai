package com.accp.biz.clm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.accp.dao.clm.IAddAdministratorDao;

@Service("IAddAdministratorBiz")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class IAddAdministratorBiz {

	@Autowired
	private IAddAdministratorDao dao;
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addAddAdministratorinfo(Integer adminID,String remarks,String remarksIP) {
		return dao.addAddAdministratorinfo(adminID, remarks, remarksIP);
	}

}
