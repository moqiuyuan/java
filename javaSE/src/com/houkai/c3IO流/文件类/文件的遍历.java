package com.houkai.c3IO��.�ļ���;

import java.io.File;
//����һ������·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼�е��ļ���
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


public class �ļ��ı��� {
	public static void main(String[] args) {
		File dir = new File("F:\\ChinaNetYX");
		new ShowDir().FindDir(dir);
	}
}
