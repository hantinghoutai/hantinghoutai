package com.accp.action.qtm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.qtm.RefundBiz;
import com.accp.vo.qtm.Refund;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/tuikuan")
public class RefundAction {
			@Autowired
			private RefundBiz biz;
			
			@GetMapping("select/list/{a}/{b}")
			public PageInfo<Refund> t4(@PathVariable int a,@PathVariable int b) {
				return biz.select(a, b);
			}
			@GetMapping("select/{refundID}")
			public int t5(@PathVariable int refundID) {
				return biz.panduan(refundID);
			}
			@GetMapping("select/info/{refundID}")
			public Refund t6(@PathVariable int refundID) {
				return biz.listinfo(refundID);
			}
			@PutMapping("update/{adminStatus}/{refundID}/{adminRemarks}")
			public int t7(@PathVariable int adminStatus,@PathVariable int refundID,@PathVariable String adminRemarks) {
				return biz.updates(adminStatus, refundID, adminRemarks);
			}
			@PutMapping("updates/{adminStatus}/{refundID}/{ActualRefundMoney}")
			public int t8(@PathVariable int adminStatus,@PathVariable int refundID,@PathVariable int ActualRefundMoney) {
				return biz.update(adminStatus, refundID, ActualRefundMoney);
			}
			@DeleteMapping("delete/{id}")
			public int t9(@PathVariable String id) {
				return biz.datele(id);
			}
			@GetMapping("select/userid/{userName}")
			public int t8(@PathVariable String userName) {
				return biz.userid(userName);
			}
			@GetMapping("select/sid/{orderID}")
			public int t9(@PathVariable int orderID) {
				return biz.sid(orderID);
			}
			@PutMapping("update/yonghu/{userid}/{userMoney}")
			public int t10(@PathVariable int userid,@PathVariable int userMoney) {
				return biz.uupdate(userid, userMoney);
			}
			@PutMapping("update/shanjia/{sid}/{userMoney}")
			public int t11(@PathVariable int sid,@PathVariable int userMoney) {
				return biz.supdate(sid, userMoney);
			}
			@PostMapping("add/goldnotes/{userid}/{userMoney}")
			public int t12(@PathVariable int userid,@PathVariable float userMoney) {
				
				return biz.jiajilu(userid, userMoney);
			}
			@PostMapping("add/goldnotess/{sid}/{userMoney}")
			public int t13(@PathVariable int sid,@PathVariable float userMoney) {
				float qian=-userMoney;
				return biz.jiajilu(sid, qian);
			} 
}
