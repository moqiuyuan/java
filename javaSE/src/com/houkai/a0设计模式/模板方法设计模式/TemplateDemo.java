package com.houkai.a0设计模式.模板方法设计模式;

abstract class GetTime{
	final public void getTime(){
		long start = System.currentTimeMillis();
		runcode();
		long end = System.currentTimeMillis();
		System.out.println("运行时间"+(end-start));
	}
	
	abstract public void runcode();
}

class SubTime extends GetTime{

	@Override
	public void runcode() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
	}
}



public class TemplateDemo {
	public static void main(String[] args) {
		new SubTime().getTime();
	}
}
