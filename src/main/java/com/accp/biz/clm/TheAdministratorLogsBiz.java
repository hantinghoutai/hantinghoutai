package com.accp.biz.clm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.clm.TheAdministratorLogs;
import com.accp.pojo.Administratorlog;
import com.accp.vo.clm.AdminVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class TheAdministratorLogsBiz {
	
	@Autowired
	private TheAdministratorLogs dao;
	
	public PageInfo<AdminVo> selectInfo(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<AdminVo>(dao.selectInfo());
	}
}
