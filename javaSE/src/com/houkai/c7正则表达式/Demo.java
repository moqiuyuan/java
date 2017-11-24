package com.houkai.c7正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	public static void main(String[] args) {
		String str = "mingtianjiangyaofangjiale";
		//String reg = "[1-9]\\d{4,14}";
		String reg = "\\w*";
		
		String e = "\\b[a-z]{3}\\b";
		Pattern p = Pattern.compile(reg);   //将规则封装成对象
		Matcher m = p.matcher(str);     //获取匹配的对象
		//Attempts to find the next subsequence of 
		//the input sequence that matches the pattern. 
		while(m.find()){
		   System.out.println(m.group());
		}
		
	}
}
