package com.zx.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zx.service.ISearch;
import com.zx.service.impl.ISearchImpl;

import cn.hutool.core.util.StrUtil;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.zx.common.*;
import com.zx.util.RespWrite;

@WebServlet("/hotel.do")
public class SearchController extends HttpServlet {

	private static final long serialVersionUID = 7723086583204133716L;

	
	private ISearch searchService = new ISearchImpl();


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String service = req.getParameter("service");
		System.out.println(service);
		try {
			Method method  = this.getClass().getDeclaredMethod(service, HttpServletRequest.class,HttpServletResponse.class);
			method.invoke(this, req,resp);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	/**
	 * @Title: list
	 * @author: Mr.T   
	 * @date: 2020年2月26日 上午9:51:04 
	 * @Description: 用户列表
	 * @param req
	 * @param resp
	 * @return: void
	 */
	protected void list(HttpServletRequest req, HttpServletResponse resp) {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String price = req.getParameter("price");
		String address = req.getParameter("address");
		String mobile = req.getParameter("mobile");
		//分页参数
		String page = req.getParameter("page");
		String limit = req.getParameter("limit");
		
		Map<String,Object> param = new HashMap<>();
		if(StrUtil.isNotBlank(id)) {
			param.put("id", id);
		}
		if(StrUtil.isNotBlank(name)) {
			param.put("name", name);
		}
		if(StrUtil.isNotBlank(type)) {
			param.put("type", type);
		}
		if(StrUtil.isNotBlank(price)) {
			param.put("price", price);
		}
		if(StrUtil.isNotBlank(address)) {
			param.put("address", address);
		}
		if(StrUtil.isNotBlank(mobile)) {
			param.put("mobile", mobile);
		}
		System.out.println("------------");
		System.out.println(param.get("id"));
		System.out.println(param.get("name"));
		System.out.println(param.get("type"));
		System.out.println(param.get("price"));
		System.out.println(param.get("address"));
		System.out.println(param.get("mobile"));
		System.out.println("------------");
		
		Result rs = searchService.queryPage(param, page, limit);
		//将业务结果进行输出
		RespWrite.writerJson(resp, rs);
	}
	
	protected void add(HttpServletRequest req, HttpServletResponse resp) {
		String userName = req.getParameter("userName");
		String realName = req.getParameter("realName");
		String type = req.getParameter("type");
		Result rs = searchService.add(userName,realName,type);
		//将业务结果进行输出
		RespWrite.writerJson(resp, rs);
	}
	
	protected void delete(HttpServletRequest req, HttpServletResponse resp) {
		String[] ids = req.getParameterValues("id");
		Result rs = userService.delete(ids);
		UserCache.remove(ids);
		//将业务结果进行输出
		RespWriter.writerJson(resp, rs);
	}
	
	
	/*

	protected void reset(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String id = req.getParameter("id");
		Result rs = userService.resetPwd(id);
		//将数据输出
		RespWriter.writerJson(resp, rs);
	}
	
	
	protected void enable(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String id = req.getParameter("id");
		Result rs = userService.enable(id);
		//将数据输出
		RespWriter.writerJson(resp, rs);
	}
	
	protected void salesman(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Result rs = userService.salesman();
		//将数据输出
		RespWriter.writerJson(resp, rs);
	}
	*/
	
}

