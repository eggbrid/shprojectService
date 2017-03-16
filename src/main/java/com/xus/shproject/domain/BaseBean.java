package com.xus.shproject.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 日期: 2017年3月16日 说明:
 * 
 */

public class BaseBean implements Serializable {
	private String id;
	private Date creatTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

}
