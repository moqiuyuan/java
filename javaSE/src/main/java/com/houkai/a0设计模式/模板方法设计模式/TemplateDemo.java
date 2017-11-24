package com.houkai.a0���ģʽ.ģ�巽�����ģʽ;

abstract class GetTime{
	final public void getTime(){
		long start = System.currentTimeMillis();
		runcode();
		long end = System.currentTimeMillis();
		System.out.println("����ʱ��"+(end-start));
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
