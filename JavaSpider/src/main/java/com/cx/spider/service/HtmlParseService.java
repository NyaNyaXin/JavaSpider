package com.cx.spider.service;

import java.util.List;

import com.cx.spider.bean.Office;

public interface HtmlParseService {
	public List<Office> getOfficeMessage(String url,int maxPage,String keyword);
}
