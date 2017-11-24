package com.houkai.a1位运算;

public class 两个数交换 {
	private static int a = 1;
	private static int b = 2;
	private static int c;
	
	public static void main(String[] args) {
		//mehtod1();
		//mehtod2();
		mehtod3();
	}
	
	public static void mehtod1(){
		System.out.println("a="+a+"\tb="+b);
		c = a;
		a = b;
		b = c;
		System.out.println("a="+a+"\tb="+b);
	}
	
	public static void mehtod2(){
		System.out.println("a="+a+"\tb="+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a="+a+"\tb="+b);
	}
	
	public static void mehtod3(){
		System.out.println("a="+a+"\tb="+b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a="+a+"\tb="+b);
	}
}
