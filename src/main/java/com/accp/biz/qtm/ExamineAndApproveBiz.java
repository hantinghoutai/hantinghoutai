package com.accp.biz.qtm;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.qtm.IExamineAndApproveDao;
import com.accp.vo.qtm.ExamineAndApprove;
import com.accp.vo.qtm.ExamineAndApproveInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ExamineAndApproveBiz {
	@Autowired
	private IExamineAndApproveDao dao;
	
	public List<String> type(){
		return dao.classify();
	}
	
	public PageInfo<ExamineAndApprove> select(int a,int b){
		PageHelper.startPage(a, b);
		List<ExamineAndApprove> list=dao.query();
		PageInfo<ExamineAndApprove> fenye=new PageInfo<ExamineAndApprove>(list);
		return fenye;
	}
	
	public PageInfo<ExamineAndApprove> condition(int a,int b,String type,int zt,String title,Date ktime,Date jtime){
		PageHelper.startPage(a, b);
		List<ExamineAndApprove> list=dao.condition(type, zt, title, ktime, jtime);
		PageInfo<ExamineAndApprove> fenye=new PageInfo<ExamineAndApprove>(list);
		return fenye;
	}
	public ExamineAndApproveInfo Info(int id) {
		return dao.info(id);
	}
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int pupdates(int zt,String yijian,String id) {
		return dao.pupdate( zt,yijian,id);
	}
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int chongg(int zt,String id) {
		return dao.pupdatess(zt, id);
	}
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int tuijian(int zt,String id) {
		return dao.tui(zt, id);
	}
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int yingye(int zt,String id) {
		return dao.yin(zt, id);
	}
	public List<ExamineAndApprove> tianjiao(int stid){
		return dao.tiaojian(stid);
	}
		
}
