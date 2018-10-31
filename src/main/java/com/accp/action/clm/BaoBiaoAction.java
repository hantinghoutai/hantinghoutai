package com.accp.action.clm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.clm.BaoBiaoBiz;
import com.accp.dao.clm.IBaoBiao;
import com.accp.vo.clm.BaoBiaoChongZhiVo;
import com.accp.vo.clm.BaoBiaoVo;


@RestController
@RequestMapping("/clm/api")
public class BaoBiaoAction {

	@Autowired
	private BaoBiaoBiz biz;
	
	
	@GetMapping("/selectBaoBiaoInfo")
	public List<BaoBiaoVo> selectBaoBiaoInfo(){
		return biz.selectBaoBiaoInfo();
	}
	
	@GetMapping("/selectBaoBiaoInfoMonth/{year}")
	public List<BaoBiaoVo> selectBaoBiaoInfoMonth(@PathVariable String year){
		return biz.selectBaoBiaoInfoMonth(year);
	}
	@GetMapping("/selectBaoBiaoYear")
	public List<BaoBiaoVo> selectBaoBiaoYear(){
		return biz.selectBaoBiaoYear();
	}
	@GetMapping("/selectBaoBiaoMonth/{year}")	
	public List<BaoBiaoVo> selectBaoBiaoMonth(@PathVariable String year){
		return biz.selectBaoBiaoMonth(year);
	}

	@GetMapping("/selectChongBaoBiaoYear")	
	public List<BaoBiaoVo> selectChongBaoBiaoYear(){
		return biz.selectChongBaoBiaoYear();
	}
	@GetMapping("/selectChongXianShangBaoBiaoMonth/{year}")
	public List<BaoBiaoVo> selectChongXianShangBaoBiaoMonth(@PathVariable String year){
		return biz.selectChongXianShangBaoBiaoMonth(year);
	}
	@GetMapping("/selectChongXianXiaBaoBiaoMonth/{year}")
	public List<BaoBiaoVo> selectChongXianXiaBaoBiaoMonth(@PathVariable String year){
		return biz.selectChongXianXiaBaoBiaoMonth(year);
	}
	@GetMapping("/selectChongBaoBiaoYear1")	
	public List<BaoBiaoVo> selectChongBaoBiaoYear1(){
		return biz.selectChongBaoBiaoYear1();
	}
	
	@GetMapping("/selectChongBaoBiaoYearInfo")	
	public List<Integer> selectChongBaoBiaoYearInfo(){
		return biz.selectChongBaoBiaoYearInfo();
	}
	
}
