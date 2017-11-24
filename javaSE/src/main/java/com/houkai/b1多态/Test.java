package com.houkai.b1多态;

public class Test {
	public static void main(String[] args) {
		//父类指向子类对象  就可以用父类的类型调用子类重写父类的方法
		//前提：子类覆盖父类的方法
		People man = new Man();	
		man.work();
		
		//a instanceof A  a是A的类型吗
		if(man instanceof People){
			System.out.println("man 是 People 类型");
		}
		
	}
}
