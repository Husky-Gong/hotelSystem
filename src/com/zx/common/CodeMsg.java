package com.zx.common;

public enum CodeMsg {
	//表示成功
	SUCCESS(200,"success"),
	//注意,所有的业务码是分模块的,
	//001  用户模块
	USER_ACCOUNT_ERROR(400001001,"用户账号密码错误"),
	USER_INVALID_ERROR(400001002,"用户账号已失效"),
	USER_CHECK_CODE_ERROR(400001003,"用户验证码不正确"),
	USER_USERNAME_EXIST_ERROR(400001004,"用户名已被使用"),
	USER_DELETE_ERROR(400001005,"用户已关联业客户,无法删除"),
	USER_LOGIN_TIMEOUT_ERROR(400001006,"登录用户无效,请重新登录"),

	
	//002 系统模块
	SYS_USER_LOGIN_NVALID_ERROR(400002001,"用户登录已失效"),
	SYS_USER_PASSWORD_ERROR(400002002,"用户原始密码错误"),
	SYS_USER_IMG_SAVE_ERROR(400002003,"用户头像保存失败"),
	
	CUSTOMER_PHONE_EXIST_ERROR(400003001,"客户手机号已被使用"),
	
	;
	
	
	/**
	 *  业务码
	 */
	Integer code ;
	/**
	 * 业务消息
	 */
	String msg;
	
	
	CodeMsg(Integer code,String msg){
		this.code = code;
		this.msg = msg;
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
	
	
}
