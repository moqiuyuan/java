package com.houkai.b2内部类;

//1. 成员内部类
public class Demo {
	private int c = 1;
	public int d = 2;
	
	public static void main(String[] args) {
		//调用内部类  需要先从外部开始
		Inner inner = new Demo().new Inner();
		inner.getA();
		int e = inner.b;
		System.out.println(e);
		
	}
	
	public class Inner{
		public int a = 3;
		private int b = 4;
		
		public void getA(){
			System.out.println(a+"内部的方法");
			System.out.println(c+"--外部的--"+d);
		}
	}
}
