package com.houkai.a0设计模式.工厂设计模式.factorymethod;

interface Product{}

interface Factory{
	public Product create();
}

class Washer implements Product{
	public Washer() {
		System.out.println("洗衣机被生产了！");
	}
}

class Icebox  implements Product{
	public Icebox () {
		System.out.println("冰箱被生产了！");
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