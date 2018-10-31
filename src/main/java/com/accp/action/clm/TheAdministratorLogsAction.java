package com.accp.action.clm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.clm.TheAdministratorLogsBiz;
import com.accp.dao.clm.TheAdministratorLogs;
import com.accp.pojo.Administratorlog;
import com.accp.vo.clm.AdminVo;
import com.accp.vo.clm.TheAdminVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@RestController
@RequestMapping("/clm/api")
public class TheAdministratorLogsAction {

	@Autowired
	private TheAdministratorLogsBiz biz;
	
	
	@GetMapping("/selectInfoAdmin/{pageNum}/{pageSize}")
	public PageInfo<TheAdminVo> selectInfo(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		return biz.selectInfo(pageNum, pageSize);
	}

}
