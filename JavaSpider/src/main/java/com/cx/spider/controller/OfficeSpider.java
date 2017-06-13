package com.cx.spider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cx.spider.service.HtmlParseService;

@Controller
public class OfficeSpider {
	@Autowired
	private HtmlParseService htmlParseService;
	
	public void spiderOfficeToDb(String url) {
		
	}
}
