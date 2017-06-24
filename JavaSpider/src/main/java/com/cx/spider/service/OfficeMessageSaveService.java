package com.cx.spider.service;

import java.util.List;

import com.cx.spider.bean.Office;

public interface OfficeMessageSaveService {
	public int saveOfficeMessage(List<Office> offices);
	public void deleteData();
}
