package com.houkai.b2�ڲ���;

//1. ��Ա�ڲ���
public class Demo {
	private int c = 1;
	public int d = 2;
	
	public static void main(String[] args) {
		//�����ڲ���  ��Ҫ�ȴ��ⲿ��ʼ
		Inner inner = new Demo().new Inner();
		inner.getA();
		int e = inner.b;
		System.out.println(e);
		
	}
	
	public class Inner{
		public int a = 3;
		private int b = 4;
		
		public void getA(){
			System.out.println(a+"�ڲ��ķ���");
			System.out.println(c+"--�ⲿ��--"+d);
		}
	}
}
