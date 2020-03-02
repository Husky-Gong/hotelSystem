package com.zx.common;

import java.util.List;

public class PageInfo<T> {
	/**
	 * 当前页码
	 */
	private Integer page;
	/**
	 * 	每页数据长度
	 */
	private Integer limit;
	/**
	 * 	符合条件的总条数
	 */
	private Integer count;
	/**
	 * 	符合条件的数据
	 */
	private List<T> data;
	
	public PageInfo() {}
	
	public PageInfo(Integer page, Integer limit, Integer count, List<T> data) {
		super();
		this.page = page;
		this.limit = limit;
		this.count = count;
		this.data = data;
	}
	
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	
}
