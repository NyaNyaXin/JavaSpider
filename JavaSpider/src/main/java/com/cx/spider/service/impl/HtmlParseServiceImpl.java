package com.cx.spider.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.cx.spider.bean.Office;
import com.cx.spider.service.HtmlParseService;

@Service
public class HtmlParseServiceImpl implements HtmlParseService {

	private String url = "";
	private List<Office> offices;
	private Office office;

	@Override
	public List<Office> getOfficeMessage(String city,int page) {
		url = "http://sou.zhaopin.com/jobs/searchresult.ashx?jl=" + city + "&kw=java&p=" + page;
		offices = getHtmlDocument(url);

		return offices;
	}

	private List<Office> getHtmlDocument(String url) {
		offices = new ArrayList<>();
		try {
			Document document = Jsoup.connect(url).get();
			Elements elements = document.select(".newlist:gt(0) tbody tr:lt(1)");
			for (Element e : elements) {
				office = new Office();
				office.setOfficeName(e.select(".zwmc").text());
				office.setCompanyName(e.select(".gsmc").text());
				office.setSalary(e.select(".zwyx").text());
				office.setLocation(e.select(".gzdd").text());
				office.setReleaseDate(e.select(".gxsj").text());
				offices.add(office);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return offices;
	}

}
