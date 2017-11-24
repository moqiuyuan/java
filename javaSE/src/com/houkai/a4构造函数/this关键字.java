package com.houkai.a4构造函数;

public class this关键字 {
	private int a;
	private int b;
	
	public this关键字() {
		System.out.println("被this()调用");
	}
	
	//含有有参的构造函数   就不自动调用无参的构造方法了
	public this关键字(int a) {
		this();
		this.a = a;
	} 
	
	public this关键字(int a,int b) {
		this(a);
		this.b = b;
		System.out.println(a+"----"+b);
	}
	
	public static void main(String[] args) {
		System.out.println("---主函数-----");
		new this关键字(1,2);
	}
}
