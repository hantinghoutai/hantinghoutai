package com.accp.dao.qtm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.qtm.Rank;

public interface IRankDao {
			public List<String> fenlei();
			
			
			public List<Rank> chaxun();
			
			
			public Rank info(@Param("id")int id);
			
			public int delete(@Param("id")int id);
			
			public int update(@Param("rank")Rank rank);
			
			public List<Rank> fenleicha(@Param("stid")int stid);
			
			public int inserts(@Param("rank")Rank rank);
}
