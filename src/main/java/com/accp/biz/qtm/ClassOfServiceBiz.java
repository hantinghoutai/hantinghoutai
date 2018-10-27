package com.accp.biz.qtm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.qtm.IClassOfService;
import com.accp.pojo.Servicetype;


@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ClassOfServiceBiz {
		@Autowired
		private IClassOfService dao;
		
		public List<Servicetype> select(){
			return dao.selectServicetype();
		}
		
		public List<Servicetype> info(Integer id) {
			return dao.selectId(id);
		}
		
		public List<Servicetype> selectName(String stname){
			return dao.selectClassify(stname);
		}
		
		@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
		public int update(Integer id,Servicetype type) {
			return dao.updateClassify(id, type);
		}
		@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
		public int delete(Integer id) {
			return dao.deleteClassify(id);
		}
		
	
			
}
