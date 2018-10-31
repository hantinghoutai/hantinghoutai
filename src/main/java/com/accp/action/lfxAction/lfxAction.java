package com.accp.action.lfxAction;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.biz.lfxBiz.AppraisalapplyBiz;
import com.accp.pojo.Goldnotes;
import com.accp.pojo.User;
import com.accp.vo.lfx.*;
import com.github.pagehelper.PageInfo;
@Controller
@RequestMapping("/lfxapply")
public class lfxAction {
	@Autowired
	private AppraisalapplyBiz biz;

	@GetMapping("queryApplyVo")
	public String getStudentListVo(String userName,Integer auditStatus,Integer p, Integer s, Model model, HttpSession session) {
		if(userName==null||userName=="") {
			userName=null;
		}
		if(auditStatus==0||auditStatus==null) {
			auditStatus=0;
		}
		PageInfo<AppraisalapplyVo> pageInfo =biz.findAppraisalapplyVo( userName, auditStatus, p, s);
		model.addAttribute("PAGE_INFO",pageInfo);
		return "lfxApplay/Appraisal-audit";
	}
	@GetMapping("xiuapply")
	public String xiugaiapply(Integer auditStatus,Integer applyID) {		
	biz.modifyapply(auditStatus,applyID);
		return "redirect:/lfxapply/queryApplyVo?userName=&auditStatus=0&p=1&s=2";
	}
	@GetMapping("xiangapply")
	public String getchengxianglist(Integer applyID, Model model, HttpSession session) {
		AppraisalapplyVo vo=biz.queryapplyVox(applyID);
		model.addAttribute("xiangvo",vo);
		return "lfxApplay/appraisaxqa";
	}
	@GetMapping("queryShoppingentry")
	public String getShoppingentry(String userName,Integer auditStatus,Integer merchantType,Integer p, Integer s, Model model, HttpSession session) {
		if(userName==null||userName=="") {
			userName=null;
		}
		if(auditStatus==0||auditStatus==null) {
			auditStatus=0;
	}
		if(merchantType==0||merchantType==null) {
			merchantType=0;
	}
		PageInfo<User> pageInfoentry =biz.findShoppingentry(userName, merchantType, auditStatus, p, s);
		model.addAttribute("PAGE_INFOENTRY",pageInfoentry);
		return "lfxApplay/Merchants-move-in";
	}
	//查看商家入驻详情
	@GetMapping("xiangentry")
	public String getapplyxiang(Integer userid, Model model, HttpSession session) {
		User user=biz.querentryx(userid);
		model.addAttribute("entryxiang",user);
		return "lfxApplay/shangjiaruzhux";
	}	
	//查看提现记录
	@PostMapping("/querytixian")
	@ResponseBody
	public HashMap<Object, Object>  gettixian(String userName,String auditStatus,Integer pageNum, Integer pageSize) {
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		PageInfo<PutforwardrecordVo> pageInfo=biz.findtixian(userName, auditStatus,pageNum,pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	}
	//查看提现详情
	@GetMapping("/querytix")
	@ResponseBody
	public PutforwardrecordVo gettixianx(String pfID) {
		PutforwardrecordVo tixianVo=biz.querytixianx(pfID);
		return tixianVo;
	}	
	//查看帖子
	@GetMapping("querypost")
	public String getpost(String fName,String title,Integer p, Integer s, Model model, HttpSession session) {
		if(fName==null||fName=="") {
			fName=null;
		}
		if(title==""||title==null) {
			title=null;
		}
		PageInfo<PostVo> pageInPostVo =biz.findpost(fName, title, p, s);
		model.addAttribute("PAGE_INFOPostVo",pageInPostVo);
		return "lfxApplay/Postshou";
	}
	//查看帖子详情
	@GetMapping("querypostx")
	public String getpostx(Integer postID,Model model,HttpSession session) {
		PostVo postvo=biz.querypostx(postID);
		model.addAttribute("postx",postvo);
		return "lfxApplay/postx";
	}
	//修改帖子
	@GetMapping("xiupost")
	public String xiugaipost(Integer auditStatus, Integer operatingState, String adminOpinion, Integer postID) {		
	biz.modifypost(auditStatus, operatingState, adminOpinion, postID);;
		return "redirect:/lfxapply/querypost?fName=&title=&p=1&s=2";
	}
	//删除帖子
	@GetMapping("removepost")
	public String removepost(Integer [] postid) {		
		biz.removepost(postid);
		return "redirect:/lfxapply/querypost?fName=&title=&p=1&s=2";
	}
	//查看帖子板块
	@GetMapping("querypostbankuai")
	public String getpostbankuai(Integer p, Integer s, Model model, HttpSession session) {
		PageInfo<tiezibankuai> pageInPostbankuai =biz.findpostbankuai(p, s);
		model.addAttribute("PAGE_INFOPostbankuai",pageInPostbankuai);
		return "lfxApplay/tiezibankuai";
	}
	//删除帖子板块
	@GetMapping("removepostbankuai")
	public String removepostbankuai(Integer fmID) {		
		biz.removepostbankuai(fmID);;
		return "redirect:/lfxapply/querypostbankuai?p=1&s=2";
	}

	//查看帖子投诉
	@GetMapping("tizitou")
	public String getpost( Model model, HttpSession session) {
		List<tizitousu> tousu=biz.querypostt();
		model.addAttribute("tousu",tousu);
		return "lfxApplay/tiezit";
	}
	//删除帖子投诉
	@GetMapping("removepostt")
	public String removepostt(Integer cid) {		
		biz.removetizit(cid);;
		return "lfxApplay/tiezit";
	}
	
	//查看金币
	@PostMapping("/querygolds")
	@ResponseBody
	public HashMap<Object, Object> findgolds(String userName, String userID,Integer pageNum,Integer pageSize) {
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		PageInfo<GoldsRecord> pageInfo=biz.querygolds(userName,userID,pageNum, pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	}
	//查看金币详情
	@GetMapping("querygoldsx")
	public String findgoldsx(Integer userID,Model model,HttpSession session) {
		PutforwardrecordVo put=biz.querygoldsx(userID);
		model.addAttribute("goldsx", put);
		return "lfxApplay/goldsx";
	}
	//修改提现 标记:审批成功需要新增到金币流向记录表 需要给用户减金币
 	@PostMapping("/xiutixian")
	@ResponseBody
	public HashMap<Object, Object> xiugaitixian( String pfID,String auditStatus,String adminOpinion) {
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		int count=biz.modifytixian(pfID, auditStatus,adminOpinion);
		if(count>0) {
			switch(adminOpinion) {
			case "2":
				biz.xiugaijinbi(pfID);							//修改用户金币
				biz.tixianjilu(pfID);							//新增提现记录
				biz.zhanneixin(pfID, "您的提现申请已受理！请注意查收！！！");//发送站内信
				break;
			case "3":
				biz.zhanneixin(pfID, "您的提现申请已被管理员拒绝！！！");//发送站内信
				break;
			}
			map.put("code", 200);
		}else {
			map.put("code", 400);
		}
		return map;
	}
	//查看充值
	@PostMapping("/queryRecharge")
	@ResponseBody
	public HashMap<Object, Object> queryRecharge(String userName,String userID,String acquisitionMode,String auditStatus,Integer pageNum, Integer pageSize) {
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		PageInfo<RecordVo> pageInfo=biz.queryRecharge( userName,userID,acquisitionMode,auditStatus,pageNum,pageSize);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", pageInfo.getList());
		map.put("count", pageInfo.getTotal());
		return map;
	}
	//修改充值
	@PostMapping("/updateForward")
	@ResponseBody
	public HashMap<Object, Object> updateForward(String recordID,String auditStatus) {
			biz.updateForward(recordID,auditStatus);
			HashMap<Object, Object> map=new HashMap<Object, Object>();
			map.put("code", 200);
			return map;
	}
	//查询充值详情
	@GetMapping("/queryForward")
	@ResponseBody
	public Goldnotes queryForward(String recordID) {
		Goldnotes data=biz.queryForward(recordID);
		return data;
	}

	
}
