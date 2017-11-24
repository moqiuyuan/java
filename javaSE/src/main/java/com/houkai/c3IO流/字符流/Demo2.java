package com.houkai.c3IOÁ÷.×Ö·ûÁ÷;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo2 {
	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("F:\\aa.txt");
			FileWriter fw = new FileWriter("F:\\copyaa.txt",true);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String line = null;
			while((line=br.readLine()) != null){
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			bw.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
		
	}
}
