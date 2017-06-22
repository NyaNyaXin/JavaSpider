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
	private int i = 0;
	
	

	@Override
	public void saveOfficeMessage(List<Office> offices) {
		for (Office office : offices) {
			officeMapper.insert(office);
			i++;
		}
		System.out.println("插入" + i + "条记录");
	}



	@Override
	public void deleteData() {
		// TODO Auto-generated method stub
		officeMapper.deleteAll();
	}

}
