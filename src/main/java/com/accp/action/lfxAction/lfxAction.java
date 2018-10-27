package com.accp.action.lfxAction;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.biz.lfxBiz.AppraisalapplyBiz;
import com.accp.pojo.User;
import com.accp.vo.lfx.*;
import com.github.pagehelper.PageInfo;
@Controller
@RequestMapping("/lfxapply")
public class lfxAction {
	@Autowired
	private AppraisalapplyBiz biz;
//	@GetMapping("queryApply")
//	public String getStudentList(Integer userid,Integer auditstatus,Integer p, Integer s, Model model, HttpSession session) {
//		if(userid==null||userid==0) {
//			userid=0;
//		}
//		if(auditstatus==0||auditstatus==null) {
//			auditstatus=0;
//		}
//		PageInfo<Appraisalapply> pageInfo =biz.findAppraisalapply(userid,auditstatus,p, s);
//		model.addAttribute("PAGE_INFO",pageInfo);
//		return "lfxApplay/Appraisal-audit";
//	}
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
	@GetMapping("querytixian")
	public String gettixian(Integer p, Integer s, Model model, HttpSession session) {
		PageInfo<PutforwardrecordVo> pageInfotixian =biz.findtixian(p, s);
		model.addAttribute("TIXIAN",pageInfotixian);
		return "lfxApplay/tixian";
	}
	//查看提现详情
	@GetMapping("querytix")
	public String gettixianx(Integer pfrID,Model model,HttpSession session) {
		PutforwardrecordVo tixianVo=biz.querytixianx(pfrID);
		model.addAttribute("tixianx",tixianVo);
		return "lfxApplay/Modification-audit";
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
	//删除帖子板块的时候删除帖子
//	@GetMapping("removepostbankuait")
//	public String remvovepostbankuait(Integer postID) {
//		biz.removepostbankuait(postID);
//		return "redirect:/lfxapply/querypostbankuai?p=1&s=2";
//	}
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
	@GetMapping("querygolds")
	public String findgolds(Integer pageNum,Integer pageSize,Model model,HttpSession session) {
		PageInfo<GoldsRecord> golds=biz.querygolds( pageNum, pageSize);
		model.addAttribute("gold",golds);
		return "lfxApplay/golds";
	}
	//查看金币详情
	@GetMapping("querygoldsx")
	public String findgoldsx(Integer userID,Model model,HttpSession session) {
		PutforwardrecordVo put=biz.querygoldsx(userID);
		model.addAttribute("goldsx", put);
		return "lfxApplay/goldsx";
	}
	//修改提现
	@GetMapping("xiutixian")
	public String xiugaitixian(Integer auditStatus, Integer pfID) {		
	biz.modifytixian(auditStatus, pfID);
		return "redirect:lfxApplay/tixian";
		
	}
	//查看充值
	@GetMapping("queryRecharge")
	public String queryRecharge(Integer p, Integer s,String userName,Model model) {
		if (userName.equals("0")||userName.equals("")) {
			userName = null;
		}
		PageInfo<RecordVo> pageInfo =biz.queryRecharge(p, s, userName);
		model.addAttribute("PAGE_INFO", pageInfo);
		model.addAttribute("userName", userName);
		return "lfxApplay/Recharge-record";
	}
	//修改充值
	@PostMapping("updateForward")
	public String updateForward(ForwardVo vo,Model model,String Time,String type) {
			biz.updateForward(vo,Time);
			if(type.equals("Recharge")) {
		return "redirect:/lfxapply/queryRecharge?p=1&s=10&userName=0";
			}else if(type.equals("Gold")) {
				return "redirect:/lfxapply/getGoldList?p=1&s=10&userName=0";		
			}
			return null;
	}
	//查询充值详情
	@GetMapping("queryForward")
	public String queryForward(int userID,Model model,String type) {
		ForwardVo data=biz.queryForward(userID);
		model.addAttribute("type",type);
		model.addAttribute("data",data);
		return "lfxApplay/Cash-management";
	}

	
}
