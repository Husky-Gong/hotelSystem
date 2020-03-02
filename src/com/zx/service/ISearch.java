package com.zx.service;

import java.util.Map;

import com.zx.common.Result;


public interface ISearch {

	Result queryPage(Map<String, Object> param, String page, String limit);

	Result add(String userName, String realName, String type);

}
