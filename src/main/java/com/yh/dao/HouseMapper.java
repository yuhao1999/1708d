package com.yh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yh.domain.House;

/**
 * @于浩
 */
public interface HouseMapper {

	List getHouseList(@Param("hname")String hname);

	List getShopingList();

	void add(House house);

	void addCenter(@Param("hid")Integer hid,@Param("sid")Integer sid);

}
