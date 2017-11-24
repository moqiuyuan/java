package com.houkai.a7抽象;

public class B extends A{

	@Override
	public void swing() {
		// TODO Auto-generated method stub
		System.out.println("我必须实现父类的抽象方法！！");
		
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.song();
		b.swing();
	}

}
