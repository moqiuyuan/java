package com.houkai.c3IO流.字符字节流之间转换;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo {
	//主要是用InputStreamReader
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("F:\\aa.txt");
			InputStreamReader isr = new InputStreamReader(fis);  //将字节转为字符
			BufferedReader bf = new BufferedReader(isr);
			
			FileOutputStream fos = new FileOutputStream("F:\\copyaa.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);  //字符到字节
			BufferedWriter bw = new BufferedWriter(osw);
			
			char[] c = new char[20];
			int num = 0;
			while((num =bf.read(c)) != -1){
				bw.write(c);
				bw.flush();
			}
			bw.close();
			bf.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
