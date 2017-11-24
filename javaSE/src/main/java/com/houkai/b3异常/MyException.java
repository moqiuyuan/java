package com.houkai.b3�쳣;

public class MyException{
	public static void main(String[] args) {
		int c = 0;
		try {
			c = new Demo().div(2, 0);
		} catch (DemoException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(c);
	}
}

class Demo{
	int div(int a,int b) throws DemoException{
		if(b==0){
			throw new DemoException("����Ϊ���쳣");
		}
	return a/b;
	}
}

class DemoException extends Exception{
	DemoException(String message){
		super(message);  //���õ���message
	}
}
