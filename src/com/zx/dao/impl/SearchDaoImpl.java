package com.zx.dao.impl;

import java.util.Map;

import com.zx.common.PageInfo;
import com.zx.dao.ISearchDao;
import com.zx.pojo.SearchRst;
import com.zx.dao.BaseDao;

public class SearchDaoImpl extends BaseDao implements ISearchDao{


	//select Hotel.id,name,type,price,address,mobile from Hotel join Room on Room.hotelId=Hotel.id;
	@Override
	public PageInfo<SearchRst> selectPage(Map<String, Object> param, int page, int limit) {
		StringBuffer sb = new StringBuffer("select Hotel.id,name,type,price,address,mobile from Hotel join Room on Room.hotelId=Hotel.id ");
		System.out.println("--!@@!!@@@----");
		System.out.println(param.get("name"));
		System.out.println("--!@@!!@@@----");
		if(param.containsKey("name")) {
			sb.append(" and name ='").append(param.get("name").toString()).append("' ");
		}
		sb.append(" order by id asc");
		
		PageInfo<SearchRst> pageInfo = super.selectPage(sb.toString(), SearchRst.class, page, limit);
		
		return pageInfo;
	}

}
