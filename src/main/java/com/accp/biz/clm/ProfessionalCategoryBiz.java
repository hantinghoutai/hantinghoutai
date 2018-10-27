package com.accp.biz.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.clm.IBank;
import com.accp.dao.clm.ProfessionalCategoryDao;
import com.accp.pojo.Majortype;
@Service("ProfessionalCategory")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ProfessionalCategoryBiz {
	@Autowired
	private ProfessionalCategoryDao dao;
	
	public List<Majortype> selectLanguageType(){
		return dao.selectLanguageType();
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addLanguageType(Majortype la) {
		dao.addLanguageType(la);
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void updateLanguageType(Majortype la) {
		dao.updateLanguageType(la);
	}
	
	public Majortype selectMajortypeInfo(String id) {
		return dao.selectMajortypeInfo(id);
	}
	
	public List<Majortype> selectType(){
		return dao.selectType();
				
	}
}
