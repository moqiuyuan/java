package com.houkai.a0设计模式.工厂设计模式.simpleFactory;

interface Product {}

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

class SimpleFactory{
	public static Product factory(String productName) throws Exception{
		if("Washer".equals(productName)){
			return new Washer();
		}else if("Icebox".equals(productName)){
			return new Icebox();
		}else{
			throw new Exception("没有该商品"+productName);
		}
	}
}

public class TestProduct{
	public static void main(String[] args) {
		try {
			Product p = SimpleFactory.factory("Washer");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
