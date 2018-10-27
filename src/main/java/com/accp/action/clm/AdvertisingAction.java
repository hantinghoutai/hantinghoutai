package com.accp.action.clm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.accp.biz.clm.AdvertisingBiz;
import com.accp.dao.clm.AdvertisingDao;
import com.accp.pojo.Advertisement;
import com.accp.pojo.Advertisementtype;
import com.accp.utils.file.Upload;
import com.accp.vo.clm.AdvertisingVo;
import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("/clm/api")
public class AdvertisingAction {
	@Autowired
	private AdvertisingBiz biz;

	
	
	@GetMapping("/selectAdvertisingVoInfo/{atid}")
	public List<AdvertisingVo> selectAdvertisingVoInfo(@PathVariable String atid){
		System.out.println(atid);
		return biz.selectAdvertisingVoInfo(atid);
	}
	@GetMapping("/selectAdvertisementtypeInfo")
	public List<Advertisementtype> selectAdvertisementtypeInfo(){
		return biz.selectAdvertisementtypeInfo();
	}
	@DeleteMapping("/deleteAdvertisementtype/{aid}")
	public Map<String, String> deleteAdvertisementtype(@PathVariable String aid) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("code", "200");
		String[] aidd=aid.split(",");
		biz.deleteAdvertisementtype(aidd);
	
		return map;
	}
	
	@GetMapping("/selectAdvertisementInfos/{aid}")
	public Advertisement selectAdvertisementInfos(@PathVariable Integer aid) {
		return biz.selectAdvertisementInfos(aid);
	}
}
