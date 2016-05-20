package com.zhangpan.dom4j;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
/**
 * 增加一个学生属性(number:itcast003  xhz 23 mal)
 * @author zhangp
 *
 */
public class day02 {
	public static void main(String[] args) throws IOException {
		SAXReader reader = new SAXReader();
		Document document;
		try {
			document = reader.read(new File("students.xml"));
			//1.获得根元素
			Element root = document.getRootElement();
			
			//2.添加Element，添加number属性
			Element studentEle = root.addElement("students").addAttribute("number", "itcast_003");
			//3.添加name age sex子元素并天假子元素中的文本
			studentEle.addElement("name").addText("xhz");
			studentEle.addElement("age").addText("18");
			studentEle.addElement("sex").addText("女神");
			//4.将document对象写入到文件中
			//创建格式化器
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding("UTF-8");
			//创建写入器
			XMLWriter writer = new XMLWriter(new PrintWriter("students.xml"),format);
			//写入文件
			writer.write(document);
			System.out.println(document.asXML());
			writer.close();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
