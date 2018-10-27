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


import com.accp.biz.qtm.RankBiz;
import com.accp.vo.qtm.Rank;

@RestController
@RequestMapping("/jibie")
public class RankAction {
	@Autowired
	private RankBiz biz;
	
	@GetMapping("select")
	public List<String> t1(){
		return biz.fenlei();
	}
	
	@GetMapping("select/quan")
	public List<Rank> t2(){
		return biz.list();
				
	}
	
	@GetMapping("select/info/{id}")
	public Rank t3(@PathVariable int id) {
		return biz.infos(id);
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	@ResponseBody
	public int t4(@RequestBody Rank rank) {
		return biz.updates(rank);
	}
	@DeleteMapping("delet/{id}")
	public int t5(@PathVariable int id) {
		return biz.deletes(id);
	}
	@GetMapping("select/fen/{stid}")
	public List<Rank> t6(@PathVariable int stid) {
		return biz.fenleicha(stid);
	}
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	@ResponseBody
	public int t7(@RequestBody Rank rank) {
		return biz.insert(rank);
	}

}
