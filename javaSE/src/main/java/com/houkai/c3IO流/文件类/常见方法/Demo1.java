package com.houkai.c3IO��.�ļ���.��������;

import java.io.File;

public class Demo1 {
	public static void main(String[] args) {
		//�����ļ���Ŀ¼		
		try {
			//File f = new File("F:\\aa.txt");
			//f.createNewFile();
			
			File dir = new File("F:\\abc\\aa");
			//dir.mkdir();  //����һ��Ŀ¼
			dir.mkdirs();  //�����༶Ŀ¼
		} catch (Exception e) {
			e.printStackTrace();
		}		
		//ɾ���ļ���Ŀ¼
		//f.delete();
		//�����˳�ʱɾ��ָ�����ļ�
		File f = new File("F:\\aa.txt"); 
		f.deleteOnExit();
		//�ж��ļ�
		f.isDirectory();
		f.isFile();
		f.canRead();
		f.isHidden();
		f.canExecute();
		
		//��ȡ�ļ���Ϣ
		f.getAbsoluteFile();
		f.getParentFile();
		f.getPath();
		f.getName();
	}
}
