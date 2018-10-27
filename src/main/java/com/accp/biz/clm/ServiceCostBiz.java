package com.accp.biz.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.clm.IServiceCostDao;
import com.accp.pojo.Servicecosttype;
import com.accp.pojo.Servicetype;
import com.accp.vo.clm.ServiceCostVo;


@Service("ServiceCost")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ServiceCostBiz {
		
		@Autowired
		private IServiceCostDao dao;
	
		//查詢所有數據
		public List<ServiceCostVo> selectServiceCostInfo(String stid){
			return dao.selectServiceCostInfo(stid);
		}
		
		//查詢下拉框
		public List<Servicetype> selectServicetypeInfo(){
			return dao.selectServicetypeInfo();
		}
		@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
		public void addServicetype(Servicecosttype servicecosttype) {
			dao.addServicetype(servicecosttype);
		}
		@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
		public void deleteServicetype(Integer stid) {
			dao.deleteServicetype(stid);
		}
		@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
		public void updateServicetype(Servicecosttype servicecosttype) {
			dao.updateServicetype(servicecosttype);
		}
		
		public Servicecosttype selectServicecosttype(Integer stid) {
			return dao.selectServicecosttype(stid);
		}

}
