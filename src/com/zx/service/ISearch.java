package com.zx.service;

import java.util.Map;

import com.zx.common.Result;


public interface ISearch {

	Result queryPage(Map<String, Object> param, String page, String limit);

	Result add(String name, String price, String type, String info);


}
