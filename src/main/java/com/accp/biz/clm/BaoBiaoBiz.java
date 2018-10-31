package com.accp.biz.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.clm.IBaoBiao;
import com.accp.vo.clm.BaoBiaoChongZhiVo;
import com.accp.vo.clm.BaoBiaoVo;


@Service
public class BaoBiaoBiz {

	@Autowired
	private IBaoBiao dao;
	
	public List<BaoBiaoVo> selectBaoBiaoInfo(){
		return dao.selectBaoBiaoInfo();
	}
	
	public List<BaoBiaoVo> selectBaoBiaoInfoMonth(String year){
		return dao.selectBaoBiaoInfoMonth(year);
	}
	
	
	public List<BaoBiaoVo> selectBaoBiaoYear(){
		return dao.selectBaoBiaoYear();
	}
		
	public List<BaoBiaoVo> selectBaoBiaoMonth(String year){
		return dao.selectBaoBiaoMonth(year);
	}
	
	public List<BaoBiaoVo> selectChongBaoBiaoYear(){
		return dao.selectChongBaoBiaoYear();
	}

	public List<BaoBiaoVo> selectChongXianShangBaoBiaoMonth(String year){
		return dao.selectChongXianShangBaoBiaoMonth(year);
	}
	//线下充值
	public List<BaoBiaoVo> selectChongXianXiaBaoBiaoMonth(String year){
		return dao.selectChongXianXiaBaoBiaoMonth(year);
	}
	
	public List<BaoBiaoVo> selectChongBaoBiaoYear1(){
		return dao.selectChongBaoBiaoYear1();
	}
	
	public List<Integer> selectChongBaoBiaoYearInfo(){
		return dao.selectChongBaoBiaoYearInfo();
	}


}
