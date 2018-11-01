package com.yizhouyuan.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class BeanFactory {

	public static Object getBean(String id){
		
		try {
			//1、创建解析器
			SAXReader reader = new SAXReader();
			//2、解析文档---bean.xml在src下
			String path = BeanFactory.class.getClassLoader().getResource("bean.xml").getPath();
			Document doc = reader.read(path);
			//3、获得元素---参数是xpath规则
			Element element = (Element) doc.selectSingleNode("//bean[@id='"+id+"']");
			String className = element.attributeValue("class");
			//4、使用反射创建对象
			Class clazz = Class.forName(className);
			Object object = clazz.newInstance();
			
			return object;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
