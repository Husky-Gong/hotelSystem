package com.zx.dao;

import java.util.Map;

import com.zx.common.PageInfo;
import com.zx.pojo.SearchRst;

public interface ISearchDao {

	PageInfo<SearchRst> selectPage(Map<String, Object> param, int parseInt, int parseInt2);

}
