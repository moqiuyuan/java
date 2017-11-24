package com.houkai.a0���ģʽ.�������ģʽ.simpleFactory;

interface Product {}

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

class SimpleFactory{
	public static Product factory(String productName) throws Exception{
		if("Washer".equals(productName)){
			return new Washer();
		}else if("Icebox".equals(productName)){
			return new Icebox();
		}else{
			throw new Exception("û�и���Ʒ"+productName);
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
