package com.accp.dao.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Languagetype;
import com.accp.pojo.Majortype;

public interface ProfessionalCategoryDao {
	public List<Majortype> selectLanguageType();
	
	public void addLanguageType(@Param("la")Majortype la);
	
	public void updateLanguageType(@Param("la")Majortype la);
	
	public Majortype selectMajortypeInfo(@Param("id")String id);
	
	public List<Majortype> selectType();
}
