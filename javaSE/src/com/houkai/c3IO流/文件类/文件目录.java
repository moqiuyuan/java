package com.houkai.c3IO流.文件类;

import java.io.File;


public class 文件目录 {
	public static void main(String[] args) {
		File file = new File("F:\\");
		String[] s = file.list();   //目录下所有的文件  只是当前级别的不深入 
		for (String string : s) {
			System.out.println(string);
		}
		
		System.out.println("++++++++++++++++++++++++++++=");
		File[] f =  file.listRoots();  //列出可用的文件系统根  ，追到根目录，在列出所有等级目录
		for (File file2 : f) {
			System.out.println(file2);
		}
	}
}
