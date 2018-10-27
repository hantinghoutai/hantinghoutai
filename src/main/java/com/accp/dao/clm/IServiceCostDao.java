package com.accp.dao.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Servicecosttype;
import com.accp.pojo.Servicetype;
import com.accp.vo.clm.ServiceCostVo;

public interface IServiceCostDao {
	
	//查詢所有數據
	public List<ServiceCostVo> selectServiceCostInfo(@Param("id")String stid);
	
	//查詢下拉框
	public List<Servicetype> selectServicetypeInfo();
	
	public void addServicetype(@Param("servicecosttype")Servicecosttype servicecosttype);
	
	public void deleteServicetype(@Param("id")Integer stid);
	
	public void updateServicetype(@Param("servicecosttype")Servicecosttype servicecosttype);
	
	public Servicecosttype selectServicecosttype(@Param("id")Integer stid);
 }
