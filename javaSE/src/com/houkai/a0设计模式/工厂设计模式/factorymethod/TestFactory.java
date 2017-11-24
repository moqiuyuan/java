package com.houkai.a0���ģʽ.�������ģʽ.factorymethod;

interface Product{}

interface Factory{
	public Product create();
}

class Washer implements Product{
	public Washer() {
		System.out.println("ϴ�»��������ˣ�");
	}
}

class Icebox  implements Product{
	public Icebox () {
		System.out.println("���䱻�����ˣ�");
	}
}

class CreateWasher implements Factory{
	@Override
	public Product create() {		
		return new Washer();
	}
}

class CreateIcebox implements Factory{
	@Override
	public Product create() {
		return new Icebox();
	}	
}

public class TestFactory {
	public static void main(String[] args) {
		Factory factory = new CreateIcebox();
		factory.create();	
	}
}