package com.xus.shproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xus.shproject.dao.ShprojectDao;
import com.xus.shproject.domain.Shproject;

/**
 * 公司: 云筑网 -------------- 作者: 王旭
 * 
 * 日期: 2017年3月14日 说明:
 * 
 * 网站: http://www.yunzhuw.com/ 修订: 日期: 作者: 说明：
 * 
 */
@Service
public class ShprojectServiceImpl implements ShprojectService {
	@Autowired
	private ShprojectDao shprojectDao;

	@Override
	public Shproject selectProjectByID(String id) {
		// TODO Auto-generated method stub
		return shprojectDao.selectProjectByID(id);
	}
}
