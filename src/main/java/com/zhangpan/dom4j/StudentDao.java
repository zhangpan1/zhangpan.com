package com.zhangpan.dom4j;

import java.util.List;

public interface StudentDao {
	//增
	void saveStudent(Student stu);
	//删
	void deleteStudent(Student stu);
	void deleteStudent(String number);
	//改
	void updateStudent(Student stu);
	Student getStudentByNumber(String number); 
	List<Student> getAllStudent();
	//查
}
