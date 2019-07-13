package com.bw.bean;

public class Shop {
	private Integer sid;
	private String sname;
	private String sdate;
	private String gids;
	
	private String gname;
	private Integer gid;
	private String gnames;
	public Shop(Integer sid, String sname, String sdate, String gids, String gname, Integer gid, String gnames) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sdate = sdate;
		this.gids = gids;
		this.gname = gname;
		this.gid = gid;
		this.gnames = gnames;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getGids() {
		return gids;
	}
	public void setGids(String gids) {
		this.gids = gids;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGnames() {
		return gnames;
	}
	public void setGnames(String gnames) {
		this.gnames = gnames;
	}
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "shop [sid=" + sid + ", sname=" + sname + ", sdate=" + sdate + ", gids=" + gids + ", gname=" + gname
				+ ", gid=" + gid + ", gnames=" + gnames + "]";
	}
	
	
	
}
