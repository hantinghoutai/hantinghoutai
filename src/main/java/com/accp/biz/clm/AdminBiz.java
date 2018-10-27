package com.accp.biz.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.clm.IAdminDao;
import com.accp.pojo.Admin;
import com.accp.vo.clm.AdminVo;


@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AdminBiz {
	
	@Autowired
	private IAdminDao dao;
	
	public List<Admin> selectUserInfo(){
		return dao.selectUserInfo();
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void insertUser(Admin admin) {
		dao.insertUser(admin);
	}
	
	public int selectUserInfos(String name) {
		return dao.selectUserInfos(name);
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void updateAdmin(Admin admin) {
		dao.updateAdmin(admin);
	}
	
	public AdminVo selectAdminInfo(Integer id) {
		return dao.selectAdminInfo(id);
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void deleteAdmin(Integer id) {
		dao.deleteAdmin(id);
	}

}
