package com.cx.spider.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cx.spider.bean.Office;
import com.cx.spider.dao.OfficeMapper;
import com.cx.spider.service.OfficeMessageSaveService;

@Service
public class OfficeMessageSaveServiceImpl implements OfficeMessageSaveService {

	@Autowired
	private OfficeMapper officeMapper;

	@Override
	public int saveOfficeMessage(List<Office> offices) {
		int i = 0;
		for (Office office : offices) {
			officeMapper.insert(office);
			i++;
		}
		return i;
	}

	@Override
	public void deleteData() {
		// TODO Auto-generated method stub
		officeMapper.deleteAll();
	}

}
