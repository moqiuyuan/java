package com.houkai.a4���캯��;

public class this�ؼ��� {
	private int a;
	private int b;
	
	public this�ؼ���() {
		System.out.println("��this()����");
	}
	
	//�����вεĹ��캯��   �Ͳ��Զ������޲εĹ��췽����
	public this�ؼ���(int a) {
		this();
		this.a = a;
	} 
	
	public this�ؼ���(int a,int b) {
		this(a);
		this.b = b;
		System.out.println(a+"----"+b);
	}
	
	public static void main(String[] args) {
		System.out.println("---������-----");
		new this�ؼ���(1,2);
	}
}
