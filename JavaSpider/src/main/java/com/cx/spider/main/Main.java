package com.cx.spider.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cx.spider.controller.OfficeSpider;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		OfficeSpider officeSpider = ctx.getBean(OfficeSpider.class);
		officeSpider.spiderOfficeToDb("java",5,"北京");
	}
}
