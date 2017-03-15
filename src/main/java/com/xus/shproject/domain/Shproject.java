package com.xus.shproject.domain;
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

public class Shproject {
private String id;
private String name;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Shproject [id=" + id + ", name=" + name + "]";
}
}
