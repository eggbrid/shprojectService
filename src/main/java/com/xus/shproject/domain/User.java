package com.xus.shproject.domain;

/**
 * 作者: 王旭
 * 
 * 日期: 2017年3月16日 说明:用户
 * 
 * 网站: http://www.yunzhuw.com/ 修订: 日期: 作者: 说明：
 * 
 */

public class User extends BaseBean {
	private String number;
	private String pwd;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
