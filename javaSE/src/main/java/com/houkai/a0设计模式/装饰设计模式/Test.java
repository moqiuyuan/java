package com.houkai.a0���ģʽ.װ�����ģʽ;

public class Test {
	public static void main(String[] args) {
		new SuperPerson(new Person()).superChiFan();;
	}
}

class Person{
	public void chifan(){
		System.out.println("�Է�");
	}
}
//��Ҫ�����еĹ�����ǿʱ�������ж�����  ����ǿ����
class SuperPerson extends Person{
	private Person p;
	
	public SuperPerson(Person p) {
		this.p = p;
	}
	
	public void superChiFan(){
		System.out.println("������");
		super.chifan();
	}
}
