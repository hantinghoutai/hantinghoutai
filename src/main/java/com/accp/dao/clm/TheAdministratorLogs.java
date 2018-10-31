package com.accp.dao.clm;

import java.util.List;

import com.accp.pojo.Administratorlog;
import com.accp.vo.clm.AdminVo;
import com.accp.vo.clm.TheAdminVo;

public interface TheAdministratorLogs {
	public List<TheAdminVo> selectInfo();
}
