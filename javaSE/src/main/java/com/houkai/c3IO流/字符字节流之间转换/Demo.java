package com.houkai.c3IO��.�ַ��ֽ���֮��ת��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo {
	//��Ҫ����InputStreamReader
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("F:\\aa.txt");
			InputStreamReader isr = new InputStreamReader(fis);  //���ֽ�תΪ�ַ�
			BufferedReader bf = new BufferedReader(isr);
			
			FileOutputStream fos = new FileOutputStream("F:\\copyaa.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);  //�ַ����ֽ�
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
