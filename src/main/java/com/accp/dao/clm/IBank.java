package com.accp.dao.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Banktype;

public interface IBank {
	
	public List<Banktype> selectBankInfo();
	public void addBank(@Param("bank")Banktype bank);
	public void deleteBank(@Param("bankId")Integer bankId);
	public void updateBank(@Param("bank")Banktype bank);
	public Banktype selectBank(@Param("bankId")Integer bankId);
	
}
