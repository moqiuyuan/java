package com.houkai.b6集合.map.properties;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class Demo1 {
	public static void main(String[] args) {
		//test1();
		test2();
	}
	
	public static void test2(){
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("H:"+File.separator+"prop.txt");
			//Reads a property list (key and element pairs) from the input byte stream.
			prop.load(fis);
			FileOutputStream fos = new FileOutputStream("H:"+File.separator+"prop.txt");
			prop.setProperty("name", "houkai");
			prop.setProperty("age", "24");
			prop.setProperty("sex", "male"); 
			prop.store(fos, "注释用的");  //保存文件
			prop.list(System.out);   //输出文件信息
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void test1(){
		try { //name=houkai   age=23
			BufferedReader br = new BufferedReader(new FileReader("H:\\prop.txt"));
			String line = null;
			Properties prop = new Properties();
			while((line=br.readLine()) != null){
				String[] arr = line.split("=");
				prop.setProperty(arr[0], arr[1]);
			}
			br.close();
			
			Set<String> names = prop.stringPropertyNames();
			for (String s : names) {
				System.out.println(s+"="+prop.getProperty(s));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
