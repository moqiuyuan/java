package com.houkai.c3IO流.字节流.复制文件;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo1 {
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("F:\\StylePix.exe");
			FileOutputStream fos = new FileOutputStream("F:\\StylePix1.exe");
			
			byte[] b = new byte[1024];
			int num = 0;
			while((num = fis.read(b))!=-1){
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
