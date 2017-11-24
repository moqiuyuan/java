package com.houkai.c3IO流.文件类;

import java.io.File;
import java.io.FilenameFilter;

class FileFilter{
	private File dir = new File("F:\\");
	// dir.list  列出当前目录下的所有的文件   FilenameFilter
	private String[] arr = dir.list(new FilenameFilter(){
		@Override
		public boolean accept(File dir, String name) {	
			//选择的文件的类型
			return name.endsWith(".txt");
	}
	});
	
	public void showResult(){
		for (String s : arr) {
			System.out.println(s);
		}
	}
}
public class 文件过滤器 {
	public static void main(String[] args) {
		new FileFilter().showResult();
	}
}
