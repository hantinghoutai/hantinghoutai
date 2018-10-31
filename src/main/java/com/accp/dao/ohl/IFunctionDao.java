package com.accp.dao.ohl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.ohl.VoFunctionList;

public interface IFunctionDao {
	
	List<VoFunctionList> leftNavs(@Param("roleID") int roleID);
}
