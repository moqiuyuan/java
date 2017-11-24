package com.houkai.c3IO流.文件类;

import java.io.File;
//返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
class ShowDir{
	public void FindDir(File dir){
		File[] files = dir.listFiles();
System.out.println(files.length);
		for (int i = 0; i < files.length; i++) {
			if(files[i].isDirectory()){
				FindDir(files[i]);
			}else{
				System.out.println(files[i].getName());
			}
		}
	}	
}


public class 文件的遍历 {
	public static void main(String[] args) {
		File dir = new File("F:\\ChinaNetYX");
		new ShowDir().FindDir(dir);
	}
}
