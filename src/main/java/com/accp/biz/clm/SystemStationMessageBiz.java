package com.accp.biz.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.clm.ISystemStationMessage;
import com.accp.pojo.News;
import com.accp.pojo.User;
import com.accp.vo.clm.NewVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class SystemStationMessageBiz {

	@Autowired
	private ISystemStationMessage dao;
	
	public PageInfo<NewVo> selectNewInfo(String name,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<NewVo>(dao.selectNewInfo(name));
	}
	public List<User> selectUserInfo(String name){
		return dao.selectUserInfo(name);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addNewInfo(NewVo news) {
		dao.addNewInfo(news);
	}

}
