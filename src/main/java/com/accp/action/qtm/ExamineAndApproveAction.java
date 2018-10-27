package com.accp.action.qtm;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.qtm.ExamineAndApproveBiz;
import com.accp.vo.qtm.ExamineAndApprove;
import com.accp.vo.qtm.ExamineAndApproveInfo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/shenpi")
public class ExamineAndApproveAction {
			@Autowired
			private ExamineAndApproveBiz biz;
			
			@GetMapping("select")
			public List<String> t1(){
				return biz.type();
			}
			
			@GetMapping("select/info/{a}/{b}/{type}/{zt}/{title}/{ktime}/{jtime}")
			public PageInfo<ExamineAndApprove> t2(@PathVariable int a,@PathVariable int b,@PathVariable String type,@PathVariable int zt,@PathVariable String title,@PathVariable Date ktime,@PathVariable Date jtime){
				return biz.condition(a,b,type, zt, title, ktime, jtime);
			}
			
			@GetMapping("select/query/{a}/{b}")
			public PageInfo<ExamineAndApprove> t3(@PathVariable int a,@PathVariable int b){
				return biz.select(a,b);
			}
			@GetMapping("select/infos/{id}")
			public ExamineAndApproveInfo t4(@PathVariable int id) {
				return biz.Info(id);
			}
			@PutMapping("update/{zt}/{yijian}/{id}")
			public int t5(@PathVariable int zt,@PathVariable String yijian,@PathVariable String id) {
				return biz.pupdates( zt, yijian,id);
			}
			@PutMapping("update/{zt}/{id}")
			public int t6(@PathVariable int zt,@PathVariable String id) {
				return biz.chongg(zt, id);
			}
			@PutMapping("update/tuijian/{zt}/{id}")
			public int t7(@PathVariable int zt,@PathVariable String id) {
				return biz.tuijian(zt, id);
			}
			@PutMapping("update/yinye/{zt}/{id}")
			public int t8(@PathVariable int zt,@PathVariable String id) {
				return biz.yingye(zt, id);
			}
			@GetMapping("select/tianjiao/{stid}")
			public List<ExamineAndApprove> t9(@PathVariable int stid){
				return biz.tianjiao(stid);
			}
			
			
}
