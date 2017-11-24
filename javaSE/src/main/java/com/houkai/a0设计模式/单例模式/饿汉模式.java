package com.houkai.a0设计模式.单例模式;

public class 饿汉模式 {
	public 饿汉模式() {
		System.out.println("构造函数");
	}
	
	private static 饿汉模式  single = new 饿汉模式();
	public 饿汉模式 getInstance(){
		return single;
	}
}
