package com.houkai.a4构造函数;

import org.junit.Test;

public class 构造代码块 {
	public int a;
	public int b;
	
	static{
		System.out.println("最早");
	}
	
	{
		a = 3;
		System.out.println("第一");
	}
	
	public 构造代码块() {
		b = 4;
		System.out.println("第二");
	}
	
	@Test
	public void Test(){
		
	}
}
