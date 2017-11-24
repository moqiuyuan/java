package com.houkai.c3IO流.字节流.复制文件;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo2 {
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("F:\\StylePix.exe");
			FileOutputStream fos = new FileOutputStream("F:\\StylePix1.exe");			
			BufferedInputStream buis = new BufferedInputStream(fis);
			BufferedOutputStream buos = new BufferedOutputStream(fos);
			
			byte[] b = new byte[1024];
			int num = 0;
			while((num=buis.read(b)) != -1){
				fos.write(b, 0, num);
				fos.flush();
			}
			fos.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
	}
}
