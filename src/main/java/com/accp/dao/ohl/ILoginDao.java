package com.accp.dao.ohl;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Admin;

public interface ILoginDao {
	
	Admin login(@Param("name")String name,@Param("password")String password);
}
