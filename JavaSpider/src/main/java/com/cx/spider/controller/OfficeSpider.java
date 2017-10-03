package com.cx.spider.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cx.spider.bean.Office;
import com.cx.spider.service.HtmlParseService;
import com.cx.spider.service.OfficeMessageSaveService;
@Controller
public class OfficeSpider {
	
	private static Logger logger = LogManager.getLogger(OfficeSpider.class.getName());
	
	@Autowired
	private HtmlParseService htmlParseService;
	@Autowired
	private OfficeMessageSaveService officeMessageSaveService;
	
	List<Office> officeMessages = null;
	


	public void spiderOfficeToDb(String keyword,int pageCount,String location) {
		int count = 0;
		// 重置数据表
		officeMessageSaveService.deleteData();
		// 保存数据
		for (int i = 1; i <= pageCount; i++) {
			// 获取网页数据
			officeMessages = htmlParseService.getOfficeMessage(location,i,keyword);
			// 保存数据到数据库,并返回插入记录数
		    count += officeMessageSaveService.saveOfficeMessage(officeMessages);
		}
		logger.info("总共插入"+count+"条数据");
	}
}
