package com.houkai.c3IO��.�ļ���;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;

public class �ļ����и� {
	public static void main(String[] args) {		
		try {
			JFileChooser jc = new JFileChooser();
			jc.showDialog(null, "ѡ���ļ�");		
			File selFile = jc.getSelectedFile();
			FileInputStream fis = new FileInputStream(selFile);
			FileOutputStream fos = null;
			byte[] buf = new byte[1024*1024];
			int count = 0;
			int i = 0;
			while((i=fis.read(buf))!=-1){
				fos = new FileOutputStream("H:\\aa\\"+count++);
				fos.write(buf,0,i);
			}
			fis.close();
			fos.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
