package com.accp.biz.clm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.clm.IServiceCostDao;
import com.accp.dao.clm.ISystems;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class SystemBiz {

	@Autowired
	private ISystems dao;
	
	/**
	 * 查询当前系统配置
	 * @return
	 */
	 public com.accp.pojo.System querySystemById(){
		 	return dao.querySystemById();
		}
	 /**
	  * 修改当前系统配置
	  * @param system
	  * @return
	  */
	 
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	 public void updateSystem(com.accp.pojo.System system) {
		 dao.updateSystem(system);
	 }

}
