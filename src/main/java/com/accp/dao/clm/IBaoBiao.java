package com.accp.dao.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.clm.BaoBiaoChongZhiVo;
import com.accp.vo.clm.BaoBiaoVo;

public interface IBaoBiao {
	//交易金额年
	public List<BaoBiaoVo> selectBaoBiaoInfo();
	//交易金额月
	public List<BaoBiaoVo> selectBaoBiaoInfoMonth(@Param("year")String year);
	
	//提现金额年
	public List<BaoBiaoVo> selectBaoBiaoYear();
	//提现月
	public List<BaoBiaoVo> selectBaoBiaoMonth(@Param("year")String year);
	//线上充值金额年
	public List<BaoBiaoVo> selectChongBaoBiaoYear();
	//线下充值
	public List<BaoBiaoVo> selectChongBaoBiaoYear1();
	//线上充值金额月
	public List<BaoBiaoVo> selectChongXianShangBaoBiaoMonth(@Param("year")String year);
	//线下充值
	public List<BaoBiaoVo> selectChongXianXiaBaoBiaoMonth(@Param("year")String year);
	//查询年
	public List<Integer> selectChongBaoBiaoYearInfo();
}
