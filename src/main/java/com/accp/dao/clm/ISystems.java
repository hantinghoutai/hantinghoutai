package com.accp.dao.clm;

import org.apache.ibatis.annotations.Param;

public interface ISystems {
	//查询当前系统配置
	public com.accp.pojo.System querySystemById();
	//修改当前系统配置
	public void updateSystem(@Param("system")com.accp.pojo.System system);
}
