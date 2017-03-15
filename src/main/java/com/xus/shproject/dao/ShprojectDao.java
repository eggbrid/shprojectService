package com.xus.shproject.dao;

import org.springframework.stereotype.Repository;

import com.xus.shproject.domain.Shproject;

/**
 * 公司:  云筑网 
 * -------------- 
 * 作者:  王旭
 * 
 * 日期:  2017年3月14日
 * 说明:
 * 
 * 网站:	 http://www.yunzhuw.com/
 * 修订:
 * 日期:      作者:
 * 说明：
 * 
 */
public interface ShprojectDao {
	public Shproject selectProjectByID(String id);

}
