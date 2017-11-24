package com.houkai.b4线程.概念;

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

//线程第一种方式
class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++){
			System.out.println("线程A---"+i);
		}
	}
}

//线程第二种方式
class MyRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("线程B---"+i);
		}
		
	}
	
}
