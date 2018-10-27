package com.accp.dao.lfxDao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Appraisalapply;
import com.accp.pojo.User;
import com.accp.vo.lfx.*;

public interface AppraisalapplyDao {

public List<Appraisalapply> queryapply(@Param("userid") Integer userid,@Param("auditstatus") Integer auditstatus);
//鉴定申请vo
public List<AppraisalapplyVo> queryapplyVo(@Param("userName") String userName,@Param("auditStatus") Integer auditStatus);
//取消鉴定
public void modifyapply(@Param("auditStatus") Integer auditStatus,@Param("applyID") Integer applyID);
//查看鉴定详情
public AppraisalapplyVo queryapplyVox(@Param("applyID") Integer applyID);
//查看商家入驻
public List<User> queryShoppentry(@Param("userName")String userName,@Param("merchantType") Integer merchantType,@Param("auditStatus") Integer auditStatus);
//查看入驻详情
public User queryentryx(@Param("userid") Integer userid);
//提现管理
public List<PutforwardrecordVo> querytixian();
//查看提现管理详情
public PutforwardrecordVo querytixianx(@Param("pfrID") Integer pfrID);
//查看帖子
public List<PostVo> querypost(@Param("fName") String fName,@Param("title") String title);
//查看帖子详情
public PostVo querypostx(@Param("postID") Integer postID);
//修改帖子
public void modifypost(@Param("auditStatus") Integer auditStatus,@Param("operatingState") Integer operatingState,@Param("adminOpinion") String adminOpinion,@Param("postID") Integer postID);
//删除帖子
public void removepost(@Param("postid")  Integer [] postid);
//查看帖子板块管理
public List<tiezibankuai> querypostbankuai();
//删除帖子板块
public void removepostbankuai(@Param("fmID") Integer fmID);
//删除帖子板块的时候删除帖子
//public void removepostbankuait(@Param("postID") Integer postID);
//查看帖子板块详情 
//查看帖子投诉
public List<tizitousu> querytiezit();
//删除帖子投诉
public void removepostt(@Param("cid") Integer cid);
//金币记录
public List<GoldsRecord> querygolds();
//查看金币详情
public PutforwardrecordVo querygodlsx(@Param("userID") Integer userID);
//修改提现
public PutforwardrecordVo modifytixian(@Param("auditStatus") Integer  auditStatus,@Param("pfID") Integer  pfID);
//充值
public List<RecordVo> queryRecharge(@Param("userName")String userName);
public boolean updateForward(@Param("vo") ForwardVo vo,@Param("Time")String Time);
public ForwardVo queryForward(@Param("userID")int userID);
}
