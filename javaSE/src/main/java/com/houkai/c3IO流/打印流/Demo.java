package com.houkai.c3IOÁ÷.´òÓ¡Á÷;

import java.io.PrintStream;
import java.util.Properties;

public class Demo {
	public static void main(String[] args) {
		try{
			Properties p = System.getProperties();
			p.list(new PrintStream("F:\\aa.txt"));
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
