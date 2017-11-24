package com.houkai.a0���ģʽ.�������ģʽ.��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * Java��̬������λ��Java.lang.reflect���£�һ����Ҫ�漰�����������ࣺ
 * 1)Interface InvocationHandler��
 *   �ýӿ��н�������һ��������invoke(Object obj,Method method, Object[] args)
 *   ��ʵ��ʹ��ʱ����һ������objһ����ָ�����࣬method�Ǳ�����ķ�����argsΪ�÷����Ĳ������顣
 *   ������󷽷��ڴ������ж�̬ʵ�֡�
 * 
 * 2)Proxy�����༴Ϊ��̬�����࣬������Ҫ�����������ݣ�
 *   Static Object newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h)
 *   ���ش������һ��ʵ�������غ�Ĵ�������Ե�����������ʹ�á�
 *   ��νDynamic Proxy������һ��class������������ʱ���ɵ�class����������ʱ������ṩһ��interface������
 *   Ȼ���class��������ʵ������Щ interface��
 * */
interface Subject{
	public abstract void request();
}

//�����Ľ�ɫ
class RealSubject implements Subject{
	@Override
	public void request() {
		System.out.println("������Ŀ�걻ִ����");
	}	
}

//��̬����
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
	      RealSubject rs = new RealSubject();  //������ָ����������
	      InvocationHandler ds = new DynamicSubject(rs);  //��ʼ��������
	      Subject subject = (Subject) Proxy.newProxyInstance(rs.getClass().getClassLoader(),rs.getClass().getInterfaces(),ds );
	      subject.request();
	    }
}
