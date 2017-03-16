package com.xus.shproject.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xus.shproject.domain.Shproject;
import com.xus.shproject.service.ShprojectService;

/**
 * 公司: 云筑网 -------------- 作者: 王旭
 * 
 * 日期: 2017年3月16日 说明:
 * 
 * 网站: http://www.yunzhuw.com/ 修订: 日期: 作者: 说明：
 * 
 */
@Controller
public class TestAction {
	@Resource
	private ShprojectService shprojectService;
	@RequestMapping("/test")
	@ResponseBody
	public Shproject getIndex() {
		Shproject shproject = shprojectService.selectProjectByID("121212");
		return shproject;
	}

}
