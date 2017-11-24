package com.houkai.c3IO流.字符流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符流的抽象基类有   Reader   writer
 * */
public class Demo1 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("F:\\aa.txt");
			fw = new FileWriter("F:\\copyaa.txt",true);  //无覆盖
			
			char[] ch = new char[100];
			int num = 0;
			while((num=fr.read(ch)) != -1){
				String s = new String(ch,0,num);
				fw.write(s);
				fw.flush();
			}
			
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				if(fr != null){
					fr.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
			
			try{
				if(fw != null){
					fw.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
	}
}
