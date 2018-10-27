package com.accp.dao.ohl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.User;
import com.accp.vo.ohl.VoUserEls;
import com.accp.vo.ohl.VoUserJianding;
import com.accp.vo.ohl.VoUserRuzhu;
import com.accp.vo.ohl.VoUsersj;

public interface IUserDao {
	
	/**
	 * 查询会员信息
	 * @param userNickName
	 * @return 
	 */
	List<User> query (@Param("userRealName") String userRealName);
	
	/**
	 * 查询需要被导出的会员信息
	 * @param userNickName
	 * @return 
	 */
	List<VoUserEls> queryAll (@Param("userRealName") String userRealName);
	
	/**
	 * 根据会员编号查询会员信息
	 * @param userNickName
	 * @return 
	 */
	VoUsersj userQuery (@Param("userID") String userID);
	
	/**
	 * 后台修改用户信息
	 * @param pojo
	 * @return
	 */
	int userUpdate(@Param("pojo") User pojo);
	
	/**
	 * 修改密码
	 * @param password
	 * @return
	 */
	int passwordUpdate(@Param("userid") int userid,@Param("password") String password);
	
	/**
	 * 查询商家信息
	 * @param userRealName
	 * @param shopName
	 * @param merchantType
	 * @return
	 */
	List<User> queryShangjiaAll(@Param("userRealName")String userRealName,@Param("shopName") String shopName,@Param("merchantType") String merchantType);

	/**
	 * 修改商家信息
	 * @param pojo
	 * @return
	 */
	int updateShangjiaAll(@Param("pojo") User pojo);
	
	/**
	 * 查询商家入驻
	 * @param userRealName
	 * @param auditStatus
	 * @param merchantType
	 * @return
	 */
	List<VoUserRuzhu> queryRuzhuAll(@Param("userName")String userName,@Param("auditStatus") String auditStatus,@Param("merchantType") String merchantType);

	/**
	 * 查询商家入驻详细信息
	 * @param userID
	 * @return
	 */
	VoUserRuzhu queryRuzhuSee(@Param("userID") String userID);
	
	/**
	 * 审核用户入驻
	 * @param auditStatus
	 * @param merchantType
	 * @param reason
	 * @param userID
	 * @return
	 */
	int updateShangjiaSee(@Param("auditStatus") String auditStatus ,@Param("merchantType") String merchantType,@Param("reason") String reason,@Param("userID") String userID);
	
	/**
	 * 鉴定查询
	 * @return
	 */
	List<VoUserJianding> queryJianding(@Param("userName")String userName,@Param("auditStatus") String auditStatus);
	
	/**
	 * 鉴定查询详细信息
	 * @param applyID
	 * @return
	 */
	VoUserJianding queryJiandingSee(@Param("applyID")String applyID);
	
	/**
	 * 审核商家鉴定申请
	 * @param adminOpinion
	 * @param auditStatus
	 * @param applyID
	 * @return
	 */
	int updateJiandingSee(@Param("adminOpinion")String adminOpinion,@Param("auditStatus")String auditStatus,@Param("applyID") String applyID);
	
	/**
	 * 插叙属于用户的第几服务
	 * @param stid
	 * @param userID
	 * @return
	 */
	String selectfirstServiceID(@Param("stid")String stid,@Param("userID")String userID);
	
	/**
	 * 通过cation判断给第几服务修改鉴定状态
	 * @param cation
	 * @param bool
	 * @param userID
	 * @return
	 */
	int updateUserCation(@Param("cation")String cation,@Param("bool")boolean bool,@Param("userID")String userID);
}
