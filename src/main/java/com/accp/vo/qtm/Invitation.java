package com.accp.vo.qtm;

import java.sql.Date;

public class Invitation {
			private int postID;
			private String fmName;
			private String title;
			private Date releaseTime;
			private	int auditStatus;
			private String content;
			private int operatingState;
			private int essence;
			private int solid;
			public int getPostID() {
				return postID;
			}
			public void setPostID(int postID) {
				this.postID = postID;
			}
			public String getFmName() {
				return fmName;
			}
			public void setFmName(String fmName) {
				this.fmName = fmName;
			}
			public String getTitle() {
				return title;
			}
			public void setTitle(String title) {
				this.title = title;
			}
			public Date getReleaseTime() {
				return releaseTime;
			}
			public void setReleaseTime(Date releaseTime) {
				this.releaseTime = releaseTime;
			}
			public int getAuditStatus() {
				return auditStatus;
			}
			public void setAuditStatus(int auditStatus) {
				this.auditStatus = auditStatus;
			}
			public String getContent() {
				return content;
			}
			public void setContent(String content) {
				this.content = content;
			}
			public int getOperatingState() {
				return operatingState;
			}
			public void setOperatingState(int operatingState) {
				this.operatingState = operatingState;
			}
			public int getEssence() {
				return essence;
			}
			public void setEssence(int essence) {
				this.essence = essence;
			}
			public int getSolid() {
				return solid;
			}
			public void setSolid(int solid) {
				this.solid = solid;
			}
}
