package com.houkai.d1程序查算法;

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
		//System.out.println(x);  //这个程序会报错，因为不知道是那个x
		System.out.println(A.x);   
		System.out.println(super.x);
	}
}
