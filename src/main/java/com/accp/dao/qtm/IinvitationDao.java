package com.accp.dao.qtm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.qtm.Invitation;
import com.accp.vo.qtm.Tiaojian;

public interface IinvitationDao {
			public List<Invitation> list();
			
			public Invitation info(@Param("postid")int postid);
			
			public int updates(@Param("t")Tiaojian t);
			
			public int deletes(@Param("id")String id);
}
