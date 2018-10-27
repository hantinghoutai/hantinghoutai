package com.accp.dao.ohl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Sharea;

public interface IShareaDao {
	
	List<Sharea> query(@Param("pid")String pid,@Param("level")String level);
}
