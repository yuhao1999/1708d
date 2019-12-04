package com.yh.domain;

/**
 * @于浩
 */
public class Shoping {
	private Integer sid;
	private String sname;
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
	public Shoping(Integer sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public Shoping() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Shoping [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
