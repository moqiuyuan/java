package com.houkai.c3IO��.�ļ���;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class �ļ��ĺϲ� {
	public static void main(String[] args) {
		ArrayList<FileInputStream> fileInputList = new ArrayList<>();
		try{
			for (int i = 1; i <= 3; i++) {
				fileInputList.add(new FileInputStream("H:\\"+i+".txt"));
			}
			final Iterator<FileInputStream> it = fileInputList.iterator();
			Enumeration en = new Enumeration<FileInputStream>() {
				@Override
				public boolean hasMoreElements() {					
					return it.hasNext();
				}
				@Override
				public FileInputStream nextElement() {					
					return it.next();
				}
			};
			SequenceInputStream sis = new SequenceInputStream(en);
			
			FileOutputStream fos = new FileOutputStream("H:\\4.txt",true);
			byte[] b = new byte[5];
			int len = 0;
			while((len = sis.read(b)) != -1){
				fos.write(b,0,len);
			}
			fos.close();
			sis.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
