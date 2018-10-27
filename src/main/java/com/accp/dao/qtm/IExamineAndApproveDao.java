package com.accp.dao.qtm;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.qtm.ExamineAndApprove;
import com.accp.vo.qtm.ExamineAndApproveInfo;


public interface IExamineAndApproveDao {
			
			public List<String> classify();
			
			public List<ExamineAndApprove> query();
			
			public List<ExamineAndApprove> condition(@Param("type")String type,@Param("zt")int zt,@Param("title")String title,@Param("ktime")Date ktime,@Param("jtime")Date jtime);
			
			public ExamineAndApproveInfo info(@Param("id")int id);
			
			public int pupdate(@Param("zt")int zt,@Param("yijian")String yijian,@Param("id")String id);
			
			public int pupdatess(@Param("zt")int zt,@Param("id")String id);
			
			public int tui(@Param("zt")int zt,@Param("id")String id);
			
			public int yin(@Param("zt")int zt,@Param("id")String id);
			
			public List<ExamineAndApprove> tiaojian(@Param("stid")int stid);
}
