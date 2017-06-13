package com.cx.spider.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cx.spider.service.HtmlParseService;

public class TestService {
	
	private ApplicationContext ctx = null;
	private HtmlParseService htmlParseService;
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		htmlParseService = ctx.getBean(HtmlParseService.class);
	}
	@Test
	public void testHtmlParseService() {
		htmlParseService.getOfficeMessage("北京");
	}
}
