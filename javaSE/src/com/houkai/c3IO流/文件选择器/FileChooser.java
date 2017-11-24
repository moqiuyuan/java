package com.houkai.c3IO流.文件选择器;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.swing.JFileChooser;

public class FileChooser {
	public static void main(String[] args) {
		
		JFileChooser jc = new JFileChooser();
		jc.showDialog(null, "AAA");		
		File selFile = jc.getSelectedFile();
		
		
		try {
			InputStream is = new FileInputStream(selFile);
			byte[] b = new byte[64];//67
			StringBuilder sbf = new StringBuilder();

			int len = 0;
			while ((len=is.read(b)) != -1) {				
				sbf.append(new String(b,0,len));
			}
			System.out.println(sbf.toString());
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
