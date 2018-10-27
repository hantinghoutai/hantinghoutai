package com.accp.dao.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Sharea;

public interface INationalGeology {
	
	//查看
	public List<Sharea> selectShareaGu(@Param("areaId")String areaId);
	//查看
	public List<Sharea> selectShareaG(@Param("areaId")String areaId);
	//新增国
	public void addShareaG(@Param("sharea")Sharea sharea);
	//新增省
	public void addSharea(@Param("sharea")Sharea sharea);
	//修改
	public void updateSharea(@Param("sharea")Sharea sharea);
	//删除
	public void deleteSharea(@Param("areaId")String[] areaId);
	
	public Sharea selectSharea(@Param("areaID")Integer areaID);
}
