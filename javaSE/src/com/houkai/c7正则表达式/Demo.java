package com.houkai.c7������ʽ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	public static void main(String[] args) {
		String str = "mingtianjiangyaofangjiale";
		//String reg = "[1-9]\\d{4,14}";
		String reg = "\\w*";
		
		String e = "\\b[a-z]{3}\\b";
		Pattern p = Pattern.compile(reg);   //�������װ�ɶ���
		Matcher m = p.matcher(str);     //��ȡƥ��Ķ���
		//Attempts to find the next subsequence of 
		//the input sequence that matches the pattern. 
		while(m.find()){
		   System.out.println(m.group());
		}
		
	}
}
