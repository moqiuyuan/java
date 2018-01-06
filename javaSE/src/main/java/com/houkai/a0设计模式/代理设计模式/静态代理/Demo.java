package com.houkai.a0设计模式.代理设计模式.静态代理;
/**
 * 静态代理: 一个原类与一个代理类要一一对应。
 * 两者都实现共同的接口或继承相同的抽象类；
 * 只是在代理类中,实例化原类，在原类方法的前后添加新的逻辑。
 * */
abstract class Subject{
	abstract public void request();
} 

class RealSubject extends Subject{
	@Override
	public void request() {
		System.out.println("真正的目标被执行了");
	}	
}

class ProxySubject extends Subject{
	private RealSubject realSubject;  //以真实角色作为代理角色的属性
	
	public ProxySubject() {
		realSubject = new RealSubject();
	}
	
	@Override
	public void request() {
		BeforeRequest();
		realSubject.request();
		AfterRequest();
	}
	
	private void BeforeRequest(){
		System.out.println("----BeforeRequest----");
	}
	
	private void AfterRequest(){
		System.out.println("----AfterRequest----");
	}
}


public class Demo {	
	public static void main(String[] args) {
		Subject sub = new ProxySubject();
		sub.request();
	}
}
