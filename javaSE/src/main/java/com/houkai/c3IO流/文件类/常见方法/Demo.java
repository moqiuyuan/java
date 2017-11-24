package com.houkai.c3IO流.文件类.常见方法;

import java.io.File;

public class Demo {
	public static void main(String[] args) {
		File f1 = new File("F:\\aa.txt");
		
		File f2 = new File("F:\\abc","aa.txt");
		
		File d = new File("F:\\aa.txt");
		File f3 = new File(d,"aa.txt");
		
		File f4 = new File("F:"+File.separator+"abc","aa.txt");
	}
}
