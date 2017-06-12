package com.cx.spider.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cx.spider.bean.Office;
import com.cx.spider.dao.OfficeMapper;

public class TestSpringMybatis {
	
	private ApplicationContext ctx = null;
	private OfficeMapper officeMapper = null;
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		officeMapper = ctx.getBean(OfficeMapper.class);
	}
		
	@Test
	public void testSpringMybaits() {
		Office office = new Office("java软件工程师", "baidu", "10000", "上地", "刚刚");
		officeMapper.insert(office);
	}
}
