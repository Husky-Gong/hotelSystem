package com.zx.dao.impl;

import java.util.Map;

import com.zx.common.PageInfo;
import com.zx.dao.ISearchDao;
import com.zx.pojo.searchRst;
import com.zx.dao.BaseDao;

public class SearchDaoImpl extends BaseDao implements ISearchDao{


	//select hotel.id,name,type,price,address,mobile from hotel join room on room.hotelId=hotel.id;
	@Override
	public PageInfo<searchRst> selectPage(Map<String, Object> param, int page, int limit) {
		StringBuffer sb = new StringBuffer("select hotel.id,name,type,price,address,mobile from hotel join room on room.hotelId=hotel.id ");
		System.out.println("--!@@!!@@@----");
		System.out.println(param.get("name"));
		System.out.println("--!@@!!@@@----");
		if(param.containsKey("name")) {
			sb.append(" and name ='").append(param.get("name").toString()).append("' ");
		}
		sb.append(" order by id asc");
		
		PageInfo<searchRst> pageInfo = super.selectPage(sb.toString(), searchRst.class, page, limit);
		
		return pageInfo;
	}

}
