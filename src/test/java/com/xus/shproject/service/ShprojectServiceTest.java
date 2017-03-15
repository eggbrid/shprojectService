package com.xus.shproject.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xus.shproject.baseTest.SpringTestCase;
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
public class ShprojectServiceTest extends SpringTestCase {  
    @Autowired  
    private ShprojectService shprojectService;  
    
    Logger logger = Logger.getLogger(ShprojectServiceTest.class);  
      
    @Test  
    public void selectUserByIdTest(){  
    	Shproject shproject = shprojectService.selectProjectByID("121212");
        logger.debug("查找结果" + shproject.toString());  
    }  
      
  
}  