package com.zhangpan.dom4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class StudentDaoImpl implements StudentDao{

	public void saveStudent(Student stu) {
		try{
			Document doc = getDocument();
			Element root = doc.getRootElement();
			//4.在根元素上添加student子元素，添加属性
			Element studentEle = root.addElement("student").addAttribute("number", stu.getNumber());
			//5.在student上添加name,age,sex子元素并添加内容
			studentEle.addElement("name").setText(stu.getName());
			studentEle.addElement("age").setText(stu.getAge());
			studentEle.addElement("sex").setText(stu.getSex());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public void deleteStudent(Student stu) {
		// TODO Auto-generated method stub
		
	}

	public void deleteStudent(String number) {
		// TODO Auto-generated method stub
		
	}

	public void updateStudent(Student stu) {
		Student stu2 = getStudentByNumber(stu.getNumber());
		if(stu2 == null){
			return;
		}
		deleteStudent(stu.getNumber());
		saveStudent(stu);
		
	}

	public Student getStudentByNumber(String number) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}
	private void save2File(Document doc) throws IOException{
		//创建OutputFormat
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		XMLWriter writer = new XMLWriter(new FileOutputStream("students.xml"),format);
		writer.write(doc);
		writer.close();
	}
	private Document getDocument() throws DocumentException{
		SAXReader reader = new SAXReader();
		//2.加载xml文件==>doc
		Document doc = reader.read(new File("students.xml"));
		//获得根元素
		return doc;
	}

	public Student getByNumber(String number) {
		// TODO Auto-generated method stub
		return null;
	}
}
