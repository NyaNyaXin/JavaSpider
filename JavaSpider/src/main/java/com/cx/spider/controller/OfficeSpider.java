package com.cx.spider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cx.spider.bean.Office;
import com.cx.spider.service.HtmlParseService;
import com.cx.spider.service.OfficeMessageSaveService;
@Controller
public class OfficeSpider {
	@Autowired
	private HtmlParseService htmlParseService;
	@Autowired
	private OfficeMessageSaveService officeMessageSaveService;
	
	List<Office> officeMessages = null;

	public void spiderOfficeToDb(String keyword,int pageCount,String location) {
		// 重置数据表
		officeMessageSaveService.deleteData();
		// 保存数据
		for (int i = 1; i <= pageCount; i++) {
			// 获取网页数据
			officeMessages = htmlParseService.getOfficeMessage(location,i,keyword);
			// 保存数据到数据库
			officeMessageSaveService.saveOfficeMessage(officeMessages);
		}
	}
}
