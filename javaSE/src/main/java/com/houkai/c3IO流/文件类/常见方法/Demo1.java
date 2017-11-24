package com.houkai.c3IO流.文件类.常见方法;

import java.io.File;

public class Demo1 {
	public static void main(String[] args) {
		//创建文件及目录		
		try {
			//File f = new File("F:\\aa.txt");
			//f.createNewFile();
			
			File dir = new File("F:\\abc\\aa");
			//dir.mkdir();  //创建一级目录
			dir.mkdirs();  //创建多级目录
		} catch (Exception e) {
			e.printStackTrace();
		}		
		//删除文件及目录
		//f.delete();
		//程序退出时删除指定的文件
		File f = new File("F:\\aa.txt"); 
		f.deleteOnExit();
		//判断文件
		f.isDirectory();
		f.isFile();
		f.canRead();
		f.isHidden();
		f.canExecute();
		
		//获取文件信息
		f.getAbsoluteFile();
		f.getParentFile();
		f.getPath();
		f.getName();
	}
}
