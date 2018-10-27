package com.accp.action.qtm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.qtm.InvitationBiz;
import com.accp.vo.qtm.Invitation;
import com.accp.vo.qtm.Tiaojian;

@RestController
@RequestMapping("/tiezi")
public class InvitationAction {
			@Autowired
			private InvitationBiz biz;
			
			@GetMapping("select")
			public List<Invitation> t1(){
				return biz.select();
			}
			
			@GetMapping("select/info/{postid}")
			public Invitation t2(@PathVariable int postid) {
				return biz.InvitationInfo(postid);
			}
			
			@RequestMapping(value = "/update",method = RequestMethod.POST)
			@ResponseBody
			public int t4(@RequestBody Tiaojian t) {
				return biz.update(t);
			}
			
			@DeleteMapping("delete/{id}")
			public int t5(@PathVariable String id) {
				return biz.delete(id);
			}
			
			
			
}
