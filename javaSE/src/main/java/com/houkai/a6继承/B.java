package com.houkai.a6�̳�;

public class B extends A{
	
	public void animal(){
		super.animal();
		System.out.println("С����");
	}
	public static void main(String[] args) {
		B b = new B();
		b.animal();
	}
}
