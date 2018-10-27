package com.accp.dao.qtm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Servicetype;

public interface IClassOfService {
			/***
			 * 查询服务类别管理
			 * @return
			 */
			public List<Servicetype> selectServicetype();
			
			/***
			 * 查询分类
			 * @param stname
			 * @return
			 */
			public List<Servicetype> selectClassify(@Param("stname")String stname);
			
			/***
			 * 查看详情
			 * @param id
			 * @return
			 */
			public List<Servicetype> selectId(@Param("id")Integer id);
			
			/***
			 * 修改
			 * @param id
			 * @return
			 */
			public int updateClassify(@Param("id")Integer id,@Param("type")Servicetype type);
			
			/***
			 * 根据ID删除
			 * @param id
			 * @return
			 */
			public int deleteClassify(@Param("id")Integer id);
}
