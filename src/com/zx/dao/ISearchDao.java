package com.zx.dao;

import java.util.Map;

import com.zx.common.PageInfo;
import com.zx.pojo.searchRst;

public interface ISearchDao {

	PageInfo<searchRst> selectPage(Map<String, Object> param, int parseInt, int parseInt2);

}
