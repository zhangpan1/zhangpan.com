package com.zhangpan.sax;

import java.io.File;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Demo1 {
	public static void main(String[] args) {
		//1 获得解析器工厂类
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2 获得解析器
		try {
			SAXParser parser = factory.newSAXParser();
			//3 解析文档
			parser.parse(new File("src/students.xml"),new MyHandler2("itcast_0002"));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
