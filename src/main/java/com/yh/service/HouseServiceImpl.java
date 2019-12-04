package com.yh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yh.dao.HouseMapper;
import com.yh.domain.House;
import com.yh.domain.Shoping;

/**
 * @于浩
 */
@Service
public class HouseServiceImpl implements HouseService {

	@Autowired
	private HouseMapper mapper;

	@Override
	public PageInfo getHouseList(int pageNum, String hname) {
	    PageHelper.startPage(pageNum, 3);
	    List list=mapper.getHouseList(hname);
	    PageInfo info=new PageInfo(list);
		return info;
	}

	@Override
	public List getShopingList() {
		// TODO Auto-generated method stub
		return mapper.getShopingList();
	}

	@Override
	public void add(House house) {
		mapper.add(house);
		List<Shoping> shopings = house.getShopings();
		for (Shoping shoping : shopings) {
			if(shoping.getSid()!=null) {
				mapper.addCenter(house.getHid(),shoping.getSid());
			}
		}
		
	}
}
