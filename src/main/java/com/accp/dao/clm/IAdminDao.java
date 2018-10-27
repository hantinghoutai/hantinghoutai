package com.accp.dao.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Admin;
import com.accp.vo.clm.AdminVo;

public interface IAdminDao {
	public List<Admin> selectUserInfo();
	
	public void insertUser(@Param("admin")Admin admin);
	
	public int selectUserInfos(@Param("name")String name);
	
	public void updateAdmin(@Param("admin")Admin admin);
	
	public AdminVo selectAdminInfo(@Param("id")Integer id);
	
	public void deleteAdmin(@Param("id") Integer id);
}	
