package com.houkai.b4�߳�.����;

public class Demo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		//------------------------
		MyRunnable t2 = new MyRunnable();
		Thread t = new Thread(t2);
		t.start();
		
	}
}

//�̵߳�һ�ַ�ʽ
class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++){
			System.out.println("�߳�A---"+i);
		}
	}
}

//�̵߳ڶ��ַ�ʽ
class MyRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("�߳�B---"+i);
		}
		
	}
	
}
