package com.houkai.a0���ģʽ.����ģʽ;

public class ����ģʽ {
	public ����ģʽ() {
		System.out.println("���캯��");
	}
	
	private static ����ģʽ  single = new ����ģʽ();
	public ����ģʽ getInstance(){
		return single;
	}
}
