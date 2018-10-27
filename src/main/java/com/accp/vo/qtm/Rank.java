package com.accp.vo.qtm;

public class Rank {
				private int serlevelID;
				private String serlevelName;
				private int stid;
				private int serviceIntegralMin;
				private int serviceIntegralMax;
				public int getSerlevelID() {
					return serlevelID;
				}
				public void setSerlevelID(int serlevelID) {
					this.serlevelID = serlevelID;
				}
				public String getSerlevelName() {
					return serlevelName;
				}
				public void setSerlevelName(String serlevelName) {
					this.serlevelName = serlevelName;
				}
				public int getStid() {
					return stid;
				}
				public void setStid(int stid) {
					this.stid = stid;
				}
				public int getServiceIntegralMin() {
					return serviceIntegralMin;
				}
				public void setServiceIntegralMin(int serviceIntegralMin) {
					this.serviceIntegralMin = serviceIntegralMin;
				}
				public int getServiceIntegralMax() {
					return serviceIntegralMax;
				}
				public void setServiceIntegralMax(int serviceIntegralMax) {
					this.serviceIntegralMax = serviceIntegralMax;
				}
				public Rank(String serlevelName, int stid, int serviceIntegralMin, int serviceIntegralMax) {
					super();
					this.serlevelName = serlevelName;
					this.stid = stid;
					this.serviceIntegralMin = serviceIntegralMin;
					this.serviceIntegralMax = serviceIntegralMax;
				}
				public Rank() {}
				
}	
