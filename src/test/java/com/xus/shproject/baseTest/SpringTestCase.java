package com.xus.shproject.baseTest;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 公司: 云筑网 -------------- 作者: 王旭
 * 
 * 日期: 2017年3月14日 说明:
 * 
 * 网站: http://www.yunzhuw.com/ 修订: 日期: 作者: 说明：
 * 
 */

// 指定bean注入的配置文件
@ContextConfiguration(locations = { "classpath:application.xml" })
// 使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class SpringTestCase extends AbstractJUnit4SpringContextTests {
	protected Logger logger = LoggerFactory.getLogger(getClass());
}