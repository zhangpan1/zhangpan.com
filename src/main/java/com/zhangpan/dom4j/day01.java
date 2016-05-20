package com.zhangpan.dom4j;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class day01 {
	public static void main(String[] args) {
		SAXReader reader = new SAXReader();
		
		try {
			Document document = reader.read(new File("students.xml"));
			System.out.println(document.asXML());
		//1.获得根元素
			Element root = document.getRootElement();
		//2.迭代根元素下的所有名叫student的子元素
			List<Element> list = root.elements();
			for (Element students:list)  {
				
			}
			/*for (Iterator<Element> it = root.elementIterator("student");it.hasNext();) {
			   Element student = it.next();
		//3.获得student元素的Number属性	
			  String number = student.attributeValue("number");
		//4.student子元素的内容(name age set)
			  String name = student.elementText("name");
			  String age = student.elementText("age");
			  String sex = student.elementText("sex");
			  System.out.println("name"+name+",age"+age+",sex"+sex);
			}*/
		
		
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
