package com.houkai.a1位运算;

public class Demo {
	public static void main(String[] args) {
		int a = 3;
		System.out.println(a>>1);
		System.out.println(a<<2);
		//>>> 只有右移  最高位用零填充    无符号
		System.out.println(a>>>1);
	
		System.out.println(1^2);
		
		System.out.println(~6);
	}
}
