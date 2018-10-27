package com.accp.dao.ohl;

import org.apache.ibatis.annotations.Param;

public interface IBondDao {
	
	/**
	 * 修改用户保证金
	 * @param userID
	 * @param guaranteeMoney
	 * @return
	 */
	int guaranteeUpdate(@Param("userID") int userID,@Param("guaranteeMoney") float guaranteeMoney);
	
	/**
	 * 新增保证金记录
	 * @param userID
	 * @param goldCoin
	 * @return
	 */
	int bondAdd(@Param("userID") int userID,@Param("goldCoin") float goldCoin);
}
