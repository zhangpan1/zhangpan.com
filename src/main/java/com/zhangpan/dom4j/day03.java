package com.zhangpan.dom4j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
/**
 * 删除元素 使用XPath路径寻找
 * @author zhangp
 *
 */
public class day03 {
	public static void main(String[] args) throws IOException {
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(new File("students.xml"));
			//1.获得根元素
			Element root = document.getRootElement();
			//使用xpath找到我们需要元素
			//定义xpath
			String xpath ="//student[@number='itcast_0001']";
			Element student = (Element) document.selectSingleNode(xpath);
			//删除
			boolean aa = student.getParent().remove(student);
			//回写
			XMLWriter writer = new XMLWriter(new FileOutputStream("students.xml"),OutputFormat.createPrettyPrint());
			writer.write(document);
			writer.close();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
