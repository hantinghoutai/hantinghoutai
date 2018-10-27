package com.accp.biz.clm;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.clm.AdvertisingDao;
import com.accp.pojo.Advertisement;
import com.accp.pojo.Advertisementtype;
import com.accp.vo.clm.AdvertisingVo;


@Service("Advertising")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AdvertisingBiz {
	
	@Autowired
	private AdvertisingDao dao;
	
	//查询广告位排版数据加下拉框模糊查询
	public List<AdvertisingVo> selectAdvertisingVoInfo(String atid){
		return dao.selectAdvertisingVoInfo(atid);
	}
	//查询下拉框
	public List<Advertisementtype> selectAdvertisementtypeInfo(){
		return dao.selectAdvertisementtypeInfo();
	}
	//删除广告位
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void deleteAdvertisementtype(String[] aid) {
		dao.deleteAdvertisementtype(aid);
	}
	//新增广告位
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addAdvertisementtype(Advertisement advertisementtype) {
		dao.addAdvertisementtype(advertisementtype);
	}
	//修改广告位
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void updateAdvertisementtype(Advertisement advertisementtype) {
		dao.updateAdvertisementtype(advertisementtype);
	}
	
	//修改广告位(广告查询)
	public Advertisement selectAdvertisementInfos(Integer aid) {
		return dao.selectAdvertisementInfos(aid);
	}
	

}
