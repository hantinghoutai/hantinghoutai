package com.accp.action.qtm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.qtm.RefundBiz;
import com.accp.vo.qtm.Refund;

@RestController
@RequestMapping("/tuikuan")
public class RefundAction {
			@Autowired
			private RefundBiz biz;
			
			@RequestMapping(value = "/list",method = RequestMethod.GET)
			@ResponseBody
			public List<Refund> t4() {
				return biz.select();
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
}
