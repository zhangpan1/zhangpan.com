package com.zhangpan.netty;

import java.util.Properties;

public class BeanFactory {
	public static A getBean(){
		//1.读取配置文件
		Properties prop = new Properties();
		//2.取出用哪个实现类
		/*prop.load("src/beanFactory.properties");
		String className = prop.getProperty("A");
		class clazz = Class.ForName(className);*/
		//3.根据完整类名创建实例并返回
		return null;
	}
}
