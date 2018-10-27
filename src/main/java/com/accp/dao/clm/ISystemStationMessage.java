package com.accp.dao.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.News;
import com.accp.pojo.User;
import com.accp.vo.clm.NewVo;

public interface ISystemStationMessage {
	public List<NewVo> selectNewInfo(@Param("name")String name);
	public List<User> selectUserInfo(@Param("name")String name);
	public void addNewInfo(@Param("New")NewVo news);
}
