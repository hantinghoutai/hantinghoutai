package com.accp.dao.ohl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Servicetype;

public interface IServiceTypeDao {
	
	List<Servicetype> queryAll(@Param("stID") String stID);
	
}
