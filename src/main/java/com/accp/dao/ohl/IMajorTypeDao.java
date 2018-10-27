package com.accp.dao.ohl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Majortype;

public interface IMajorTypeDao {
	
	List<Majortype> queryAll(@Param("majorID") String majorID);
}
