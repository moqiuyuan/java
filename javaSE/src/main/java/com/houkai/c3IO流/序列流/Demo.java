package com.houkai.c3IO流.序列流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo {
	public static void main(String[] args) {
		try {
			Vector<FileInputStream> v = new Vector<>();
			v.add(new FileInputStream("H:\\1.txt"));
			v.add(new FileInputStream("H:\\2.txt"));
			v.add(new FileInputStream("H:\\3.txt"));
			Enumeration<FileInputStream>  e = v.elements();
			SequenceInputStream sis = new SequenceInputStream(e);  //只能枚举
			FileOutputStream fos = new FileOutputStream("H:\\4.txt");
			byte[] b = new byte[20];
			int len = 0;
			while((len = sis.read(b))!=-1){
				fos.write(b, 0, len);
			}
			fos.close();
			sis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
