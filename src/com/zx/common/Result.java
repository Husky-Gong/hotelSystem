package com.zx.common;

public class Result {
	/**
	 * 业务码
	 */
	private Integer code;
	/**
	 * 业务消息
	 */
	private String msg;
	/**
	 * 业务数据
	 */
	private Object data;
	/**
	 * @Title:Result
	 * @Description:业务正常时的Result
	 */
	public Result() {
		this.code = CodeMsg.SUCCESS.getCode();
		this.msg = CodeMsg.SUCCESS.getMsg();
	}
	/**
	 * @Title:Result
	 * @Description:业务正常带数据的Result
	 * @param data
	 */
	public Result(Object data) {
		this();
		this.data = data;
	}
	/**
	 * @Title:Result
	 * @Description:业务异常时的Result
	 * @param codeMsg
	 */
	public Result(CodeMsg codeMsg) {
		this.code = codeMsg.getCode();
		this.msg = codeMsg.getMsg();
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

	

}
