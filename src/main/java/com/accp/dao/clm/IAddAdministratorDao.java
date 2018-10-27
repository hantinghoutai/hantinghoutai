package com.accp.dao.clm;

import org.springframework.web.bind.annotation.PathVariable;

public interface IAddAdministratorDao {
	public int addAddAdministratorinfo(@PathVariable Integer adminID,@PathVariable String remarks,@PathVariable String remarksIP);
}
