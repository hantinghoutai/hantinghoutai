package com.accp.biz.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.clm.INationalGeology;
import com.accp.pojo.Sharea;


@Service("NationalGeology")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class NationalGeologyBiz {
	
	@Autowired
	private INationalGeology dao;
	
	public List<Sharea> selectShareaGu(String areaId){
		return dao.selectShareaGu(areaId);
	}
	//查看
	public List<Sharea> selectShareaG(String areaId){
		return dao.selectShareaG(areaId);
	}
	//新增国
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addShareaG(Sharea sharea) {
		dao.addShareaG(sharea);
	}
	//新增省
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addSharea(Sharea sharea) {
		dao.addSharea(sharea);
	}
	//修改
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void updateSharea(Sharea sharea) {
		dao.updateSharea(sharea);
	}
	//删除
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void deleteSharea(String[] areaId) {
		dao.deleteSharea(areaId);
	}
		
	public Sharea selectSharea(Integer areaID) {
		return dao.selectSharea(areaID);
	}

}
