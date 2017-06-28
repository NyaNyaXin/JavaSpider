package com.cx.spider.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cx.spider.bean.Office;
import com.cx.spider.controller.OfficeSpider;
import com.cx.spider.service.HtmlParseService;
import com.cx.spider.service.OfficeMessageSaveService;

public class TestService {

	private ApplicationContext ctx = null;
	private HtmlParseService htmlParseService;
	private OfficeMessageSaveService officeMessageSaveService;
	private OfficeSpider officeSpider;
	List<Office> officeMessages = null;
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		htmlParseService = ctx.getBean(HtmlParseService.class);
		officeMessageSaveService = ctx.getBean(OfficeMessageSaveService.class);
		officeSpider = ctx.getBean(OfficeSpider.class);
		officeMessages = new ArrayList<>();
	}

	@Test
	public void testHtmlParseService() {
		for (int i = 1; i <= 1; i++) {
			officeMessages = htmlParseService.getOfficeMessage("北京", i,"c#");
		}

	}

	@Test
	public void testHtmlParseSave() {
		// 重置数据表
		officeMessageSaveService.deleteData();
		// 保存数据
		for (int i = 1; i <= 2; i++) {
			officeMessages = htmlParseService.getOfficeMessage("北京", i,"c#");
			officeMessageSaveService.saveOfficeMessage(officeMessages);
		}

	}
	
	@Test
	public void testController() {
		officeSpider.spiderOfficeToDb("java", 10, "上海");
	}
}
