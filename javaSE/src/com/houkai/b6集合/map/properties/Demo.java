package com.houkai.b6集合.map.properties;

import java.util.Properties;

public class Demo {
	public static void main(String[] args) {
		//是hashtable的子类
		Properties pro = new Properties();
		
		pro.setProperty("name", "houkai");
		String name = pro.getProperty("name");
		System.out.println(name);
		
		//在jvm启动加载一些属性的信息
		System.setProperty("mykey", "myvalue");
		System.out.println(System.getProperty("mykey"));
		System.out.println(System.getProperty("os.name"));
	}
}
