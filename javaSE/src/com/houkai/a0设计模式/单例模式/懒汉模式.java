package com.houkai.a0���ģʽ.����ģʽ;

public class ����ģʽ {
	public ����ģʽ() {
		System.out.println("���캯��");
	}
	
	private static ����ģʽ  single = null;
	
	public ����ģʽ getInstance(){
		
		synchronized(����ģʽ.class){
			if(single == null){
				return single = new ����ģʽ(); 
			}
		}
		return single;
	}
}
