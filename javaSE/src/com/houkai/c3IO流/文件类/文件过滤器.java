package com.houkai.c3IO��.�ļ���;

import java.io.File;
import java.io.FilenameFilter;

class FileFilter{
	private File dir = new File("F:\\");
	// dir.list  �г���ǰĿ¼�µ����е��ļ�   FilenameFilter
	private String[] arr = dir.list(new FilenameFilter(){
		@Override
		public boolean accept(File dir, String name) {	
			//ѡ����ļ�������
			return name.endsWith(".txt");
	}
	});
	
	public void showResult(){
		for (String s : arr) {
			System.out.println(s);
		}
	}
}
public class �ļ������� {
	public static void main(String[] args) {
		new FileFilter().showResult();
	}
}
