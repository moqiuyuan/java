package com.houkai.b2内部类;
/**
 *匿名内部类 
 * */
public class Demo2 {
	private int c;
	public static void main(String[] args) {
		int d = new Demo2().test(1, 2);
		System.out.println(d); 
	}
	
	//匿名内部类的存在就是为了实现接口或者抽象方法
	public int test(final int a,final int b){
		return new Inner(){
			@Override
			public int add() {
				c = a + b;
				return c;
			}
		}.add();   //注意后面有个分号
		
		
	}
}

interface Inner{
	abstract public int add();
}