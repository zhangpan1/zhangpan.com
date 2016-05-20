package com.zhangpan.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
//获得所有学生信息 ,打印
public class MyHandler2 extends DefaultHandler {
	private String number;
	
	public MyHandler2(String number) {
		super();
		this.number = number;
	}

	private boolean flag = false;
	private String current = "";


	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		current = qName;
		if(qName.equals("student")&&attributes.getValue("number").equals(number)){
			flag = true;
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String str = new String(ch,start,length);
		str = str.trim();
		if(flag && str.length()>0){
			if(current.equals("name")){
				System.out.println("学生的姓名是:"+str);
			}else if(current.equals("age")){
				System.out.println("学生的年龄是:"+str);
			}else if(current.equals("sex")){
				System.out.println("学生的性别是:"+str);
			}
			
		}
		
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if(qName.equals("student")){
			flag = false;
		}
	}


}
