package com.houkai.d1������㷨;

interface A{
	int x = 0;
}

class B{
	int x = 1;
}

public class Demo0 extends B implements A{
	public static void main(String[] args) {
		new Demo0().test();
	}
	
	public void test(){
		//System.out.println(x);  //�������ᱨ����Ϊ��֪�����Ǹ�x
		System.out.println(A.x);   
		System.out.println(super.x);
	}
}
