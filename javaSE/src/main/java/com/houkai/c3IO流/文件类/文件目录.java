package com.houkai.c3IO��.�ļ���;

import java.io.File;


public class �ļ�Ŀ¼ {
	public static void main(String[] args) {
		File file = new File("F:\\");
		String[] s = file.list();   //Ŀ¼�����е��ļ�  ֻ�ǵ�ǰ����Ĳ����� 
		for (String string : s) {
			System.out.println(string);
		}
		
		System.out.println("++++++++++++++++++++++++++++=");
		File[] f =  file.listRoots();  //�г����õ��ļ�ϵͳ��  ��׷����Ŀ¼�����г����еȼ�Ŀ¼
		for (File file2 : f) {
			System.out.println(file2);
		}
	}
}
