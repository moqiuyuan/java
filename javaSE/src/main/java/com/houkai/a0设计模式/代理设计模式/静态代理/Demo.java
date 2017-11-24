package com.houkai.a0���ģʽ.�������ģʽ.��̬����;
/**
 * ��̬����: һ��ԭ����һ��������Ҫһһ��Ӧ��
 * ���߶�ʵ�ֹ�ͬ�Ľӿڻ�̳���ͬ�ĳ����ࣻ
 * ֻ���ڴ�������,ʵ����ԭ�࣬��ԭ�෽����ǰ������µ��߼���
 * */
abstract class Subject{
	abstract public void request();
} 

class RealSubject extends Subject{
	@Override
	public void request() {
		System.out.println("������Ŀ�걻ִ����");
	}	
}

class ProxySubject extends Subject{
	private RealSubject realSubject;  //����ʵ��ɫ��Ϊ�����ɫ������
	
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
