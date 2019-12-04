package com.yh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.yh.domain.House;
import com.yh.service.HouseService;

/**
 * @于浩
 */
@Controller
public class HouseController {
  
	@Autowired
	private HouseService service;
	
	@RequestMapping("list")
	public String list(Model m,@RequestParam(defaultValue="1")int pageNum,String hname) {
		PageInfo info=service.getHouseList(pageNum,hname);
		m.addAttribute("info", info);
		m.addAttribute("hname", hname);
		return "list";
	}
	
	
	
	@RequestMapping("toAdd")
	public String toAdd(Model m) {
		List shoping=service.getShopingList();
		m.addAttribute("shoping", shoping);
		m.addAttribute("house", new House());
		return "add";
	}
	
	@RequestMapping("add")
	public String add(Model m,House house) {
		service.add(house);
		return "redirect:list";
	}
	
}
