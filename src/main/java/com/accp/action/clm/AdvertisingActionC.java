package com.accp.action.clm;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.accp.biz.clm.AdvertisingBiz;
import com.accp.pojo.Advertisement;
import com.accp.utils.file.Upload;

@Controller
@RequestMapping("/clm/c")
public class AdvertisingActionC {
	@Autowired
	private AdvertisingBiz biz;
	
	@RequestMapping(value="/addAdvertisementtype",method=RequestMethod.POST)
	public String addAdvertisementtype(Advertisement advertisement,@RequestParam("img") MultipartFile file)throws Exception {
		String img=Upload.saveFile(file);
		advertisement.setAimgpath(img);
		biz.addAdvertisementtype(advertisement);
		return "redirect:/Advertisementlayout.html";
	}
	
	@RequestMapping(value="/updateAdvertisementtype",method=RequestMethod.POST)
	public String updateAdvertisementtype(Advertisement advertisement,@RequestParam("img") MultipartFile file)throws Exception {
		String img=Upload.saveFile(file);
		advertisement.setAimgpath(img);
		biz.updateAdvertisementtype(advertisement);
		return "redirect:/Advertisementlayout.html";
	}

	
}
