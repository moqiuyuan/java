package com.houkai.a0设计模式.单例模式;

public class 懒汉模式 {
	public 懒汉模式() {
		System.out.println("构造函数");
	}
	
	private static 懒汉模式  single = null;
	
	public 懒汉模式 getInstance(){
		
		synchronized(懒汉模式.class){
			if(single == null){
				return single = new 懒汉模式(); 
			}
		}
		return single;
	}
}
