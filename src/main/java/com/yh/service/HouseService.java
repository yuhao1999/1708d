package com.yh.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yh.domain.House;

/**
 * @于浩
 */
public interface HouseService {

	PageInfo getHouseList(int pageNum, String hname);

	List getShopingList();

	void add(House house);

}
