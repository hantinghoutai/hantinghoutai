package com.accp.dao.qtm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.qtm.Refund;

public interface IRefundDao {
			public List<Refund> list();
			
			public int pan(@Param("refundID")int refundID);
			
			public Refund listinfo(@Param("refundID")int refundID);
			
			public int updates(@Param("adminStatus")int adminStatus,@Param("refundID")int refundID,@Param("ActualRefundMoney")int ActualRefundMoney);
			
			public int updatess(@Param("adminStatus")int adminStatus,@Param("refundID")int refundID,@Param("adminRemarks")String adminRemarks);
			
			public int deletes(@Param("id")String id);
			
			public int supdate(@Param("userid")int userid,@Param("usermoney")int userMoney);
			
			public int userID(@Param("username")String userName);
			
			public int sid(@Param("orderid")int orderID);
			
			public int yupdate(@Param("userid")int userid,@Param("usermoney")int userMoney);
			
			public int jilu(@Param("userid")int userid,@Param("usermoney")float userMoney);
}
