package com.cx.spider.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cx.spider.controller.OfficeSpider;

public class Main {
	
	
	private static OfficeSpider officeSpider;	
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		officeSpider = ctx.getBean(OfficeSpider.class);
		officeSpider.spiderOfficeToDb("java",90,"北京");
	}
	
	public void savedata() {
		officeSpider.spiderOfficeToDb("java",90,"北京");
	}
}
