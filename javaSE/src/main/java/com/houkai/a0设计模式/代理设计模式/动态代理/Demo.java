package com.houkai.a0设计模式.代理设计模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * Java动态代理类位于Java.lang.reflect包下，一般主要涉及到以下两个类：
 * 1)Interface InvocationHandler：
 *   该接口中仅定义了一个方法：invoke(Object obj,Method method, Object[] args)
 *   在实际使用时，第一个参数obj一般是指代理类，method是被代理的方法，args为该方法的参数数组。
 *   这个抽象方法在代理类中动态实现。
 * 
 * 2)Proxy：该类即为动态代理类，其中主要包含以下内容：
 *   Static Object newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h)
 *   返回代理类的一个实例，返回后的代理类可以当作被代理类使用。
 *   所谓Dynamic Proxy是这样一种class：它是在运行时生成的class，在生成它时你必须提供一组interface给它，
 *   然后该class就宣称它实现了这些 interface。
 * */
interface Subject{
	public abstract void request();
}

//真正的角色
class RealSubject implements Subject{
	@Override
	public void request() {
		System.out.println("真正的目标被执行了");
	}	
}

//动态代理
class DynamicSubject implements InvocationHandler{
	private Object sub;
	
    public DynamicSubject(Object obj) {
      sub = obj;
    }

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		BeforeRequest();
		method.invoke(sub, args);
		AfterRequest();
		return null;
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
	      RealSubject rs = new RealSubject();  //在这里指定被代理类
	      InvocationHandler ds = new DynamicSubject(rs);  //初始化代理类
	      Subject subject = (Subject) Proxy.newProxyInstance(rs.getClass().getClassLoader(),rs.getClass().getInterfaces(),ds );
	      subject.request();
	    }
}
