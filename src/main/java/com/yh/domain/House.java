package com.yh.domain;

import java.util.List;

/**
 * @于浩
 */
public class House {
	private Integer hid;
	private String hname;
	private String datea;
	private  List<Shoping> shopings;
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getDatea() {
		return datea;
	}
	public void setDatea(String datea) {
		this.datea = datea;
	}
	public List<Shoping> getShopings() {
		return shopings;
	}
	public void setShopings(List<Shoping> shopings) {
		this.shopings = shopings;
	}
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	public House(Integer hid, String hname, String datea, List<Shoping> shopings) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.datea = datea;
		this.shopings = shopings;
	}
	@Override
	public String toString() {
		return "House [hid=" + hid + ", hname=" + hname + ", datea=" + datea + "]";
	}
	
	
}
