package com.bw.bean;

public class Goods {
	private Integer gid;
	private String gname;
	public Goods(Integer gid, String gname) {
		super();
		this.gid = gid;
		this.gname = gname;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + "]";
	}
	
}	
