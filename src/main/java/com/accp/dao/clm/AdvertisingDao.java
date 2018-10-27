package com.accp.dao.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Advertisement;
import com.accp.pojo.Advertisementtype;
import com.accp.vo.clm.AdvertisingVo;

public interface AdvertisingDao {
	
	//查询广告位排版数据加下拉框模糊查询
	public List<AdvertisingVo> selectAdvertisingVoInfo(@Param("atid")String atid);
	//查询下拉框
	public List<Advertisementtype> selectAdvertisementtypeInfo();
	//删除广告位
	public void deleteAdvertisementtype(@Param("aid")String[] aid);
	//新增广告位
	public void addAdvertisementtype(@Param("advertisementtype")Advertisement advertisementtype);
	//修改广告位
	public void updateAdvertisementtype(@Param("advertisementtype")Advertisement advertisementtype);
	
	//修改广告位(查询显示)
	public Advertisement selectAdvertisementInfos(@Param("id")Integer aid);
}
