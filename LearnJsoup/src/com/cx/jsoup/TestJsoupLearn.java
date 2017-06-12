package com.cx.jsoup;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class TestJsoupLearn {

	/**
	 * 解析和遍历一个Html文档 解析一个html字符串
	 **/
	@Test
	public void test01() {
		String html = "<html><head><title>First parse</title></head>"
				+ "<body><p>Parsed HTML into a doc.</p></body></html>";
		Document document = Jsoup.parse(html);
		Element body = document.body();
		Element child = body.child(0);
		System.out.println(child.text());
	}

	/**
	 * 解析一个body片段
	 **/
	@Test
	public void test02() {
		String html = "<body><p>aaaaaaaa</p></body>";
		Document document = Jsoup.parse(html);
		Element body = document.body();
		System.out.println(document);
	}

	/**
	 * 从一个url加载一个Document
	 **/
	@Test
	public void test03() {
		try {
			// 一般处理
			// Document document = Jsoup.connect("https://www.baidu.com/").get();
			// String title = document.title();
			// System.out.println(document);
			// 特殊处理
			Document document = Jsoup.connect("https://www.baidu.com/").data("query", "Java").userAgent("Chrome").cookie("auth", "token")
					.timeout(3000).post();
			String title = document.title();
			System.out.println(document);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 从一个文件加载一个文档
	 * **/
	
	@Test
	public void test04() {
		File file = new File("C:\\Users\\qq960\\Desktop\\a.html");
		try {
			Document document = Jsoup.parse(file, "UTF-8");
			System.out.println(document);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 使用DOM方法来遍历一个文档
	 * **/
	@Test
	public void test05() {
		File file = new File("C:\\Users\\qq960\\Desktop\\a.html");
		try {
			Document document = Jsoup.parse(file, "UTF-8");
			Element ele = document.getElementById("wrapper_wrapper");
			System.out.println(ele);
			System.out.println("_______________________________________");
			Elements links = document.getElementsByTag("a");
			for(Element link:links) {
				System.out.println(link);
				System.out.println(link.attr("href"));
				System.out.println(link.text());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 使用选择器语法来查找元素
	 * **/
	@Test
	public void test06() {
		File file = new File("C:\\Users\\qq960\\Desktop\\a.html");
		try {
			Document document = Jsoup.parse(file, "UTF-8");
			Elements elements = document.select("a[href]");
			System.out.println(elements);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 从元素集合抽取属性、文本和html内容
	 * **/
	@Test
	public void test07() {
		String html = "<p>An <a href='http://example.com/'><b>example</b></a> link.</p>";
		Document document = Jsoup.parse(html);
		Element link = document.select("a").first();
		String outerHtml = link.outerHtml();
		String inh = link.html();
		System.out.println(outerHtml);
		System.out.println(inh);
		
	}
	
	/**
	 * URL处理
	 * **/
	@Test
	public void test08() {
		try {
			Document document = Jsoup.connect("http://www.baidu.com").get();
			Element link = document.select("a").first();
			String attr = link.attr("href");
			System.out.println(attr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
