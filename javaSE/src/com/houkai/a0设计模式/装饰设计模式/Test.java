package com.houkai.a0设计模式.装饰设计模式;

public class Test {
	public static void main(String[] args) {
		new SuperPerson(new Person()).superChiFan();;
	}
}

class Person{
	public void chifan(){
		System.out.println("吃饭");
	}
}
//想要对已有的功能增强时，将已有对象传入  并加强功能
class SuperPerson extends Person{
	private Person p;
	
	public SuperPerson(Person p) {
		this.p = p;
	}
	
	public void superChiFan(){
		System.out.println("开饭酒");
		super.chifan();
	}
}
