package com.houkai.c3IO��.�ֽ���.�ı��������;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		try{
			System.setIn(new FileInputStream("F:\\aa.txt"));
			System.setOut(new PrintStream("F:\\copyaa.txt"));
			Scanner sc  = new Scanner(System.in);
			
			String a = sc.next();
			System.out.println(a);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
