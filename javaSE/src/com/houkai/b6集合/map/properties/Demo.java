package com.houkai.b6����.map.properties;

import java.util.Properties;

public class Demo {
	public static void main(String[] args) {
		//��hashtable������
		Properties pro = new Properties();
		
		pro.setProperty("name", "houkai");
		String name = pro.getProperty("name");
		System.out.println(name);
		
		//��jvm��������һЩ���Ե���Ϣ
		System.setProperty("mykey", "myvalue");
		System.out.println(System.getProperty("mykey"));
		System.out.println(System.getProperty("os.name"));
	}
}
