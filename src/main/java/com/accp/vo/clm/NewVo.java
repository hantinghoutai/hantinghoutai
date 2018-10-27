package com.accp.vo.clm;

import java.util.Date;
import java.util.List;

public class NewVo {
	 	private Integer newsid;

	    public Integer getNewsid() {
			return newsid;
		}

		public void setNewsid(Integer newsid) {
			this.newsid = newsid;
		}

		public NewVo(Integer newsid, Integer thesender, Integer addressee, Date sendingtime, Boolean readstate,
				Integer newstype, Integer messagegroup, String content, String userName) {
			super();
			this.newsid = newsid;
			this.thesender = thesender;
			this.addressee = addressee;
			this.sendingtime = sendingtime;
			this.readstate = readstate;
			this.newstype = newstype;
			this.messagegroup = messagegroup;
			this.content = content;
			this.userName = userName;
		}

		public NewVo() {
			super();
		}

		public Integer getThesender() {
			return thesender;
		}

		public void setThesender(Integer thesender) {
			this.thesender = thesender;
		}

		public Integer getAddressee() {
			return addressee;
		}

		public void setAddressee(Integer addressee) {
			this.addressee = addressee;
		}

		public Date getSendingtime() {
			return sendingtime;
		}

		public void setSendingtime(Date sendingtime) {
			this.sendingtime = sendingtime;
		}

		public Boolean getReadstate() {
			return readstate;
		}

		public void setReadstate(Boolean readstate) {
			this.readstate = readstate;
		}

		public Integer getNewstype() {
			return newstype;
		}

		public void setNewstype(Integer newstype) {
			this.newstype = newstype;
		}

		public Integer getMessagegroup() {
			return messagegroup;
		}

		public void setMessagegroup(Integer messagegroup) {
			this.messagegroup = messagegroup;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		private Integer thesender;

	    private Integer addressee;

	    private Date sendingtime;

	    private Boolean readstate;

	    private Integer newstype;

	    private Integer messagegroup;

	    private String content;
	    
	    public NewVo(String content, List<String> list) {
			super();
			this.content = content;
			this.list = list;
		}

		private String userName;
	    
	    public List<String> getList() {
			return list;
		}

		public void setList(List<String> list) {
			this.list = list;
		}

		private List<String> list;

}
