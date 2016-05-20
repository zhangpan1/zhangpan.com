package com.zhangpan.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
//获得所有学生信息 ,打印
public class MyHandler extends DefaultHandler {

	@Override
	public void startDocument() throws SAXException {
		System.out.println("文档开始解析啦!");
	}


	@Override
	//sax 1.0版本中前两个参数没有用,永远是null.
	//参数3 告知开发者当前触发的元素是哪个元素.
	//参数4 将标签上的属性 提供给你
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.println(qName+"元素开始啦!");
		//判断当前遇到的元素是否是student元素.
		if(qName.equals("student")){
			String number = attributes.getValue("number");
			System.out.println("学生的学号是:"+number);
		}
			//如果是==> 获得number属性
		
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String str = new String(ch, start, length);
		str = str.trim();//去掉两端的空白字符 回车 空格 制表符
		if(str.length() >0){
			System.out.println(str);
		}
		
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println(qName+"元素结束啦!");
	}


	@Override
	public void endDocument() throws SAXException {
		System.out.println("文档结束解析啦!");
	}
}
