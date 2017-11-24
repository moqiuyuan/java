package com.houkai.b4�߳�;

public class ProducerConsumerDemo {
	public static void main(String[] args) {
		Resource r = new Resource();
		
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(c);
		Thread t4 = new Thread(c);
		
		t1.setName("�����߳�һ");	
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();	
		
	}
}

//ͬ���ǶԶ���Դ������
class Resource{
	private String name;
	private int count = 1;
	private boolean flag = false;
	
	//wait()�ͷ���Դ�ͷ���      sleep()�ͷ���Դ���ͷ���
	public synchronized void set(String name){
		//false��ʾû�ж��� �ͻ���������  �ж��� ��ô���ͷ���
		while(flag){
			try {this.wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		
		this.name = name+"---"+count++;
		System.out.println(Thread.currentThread().getName()+"..������.."+this.name);
		flag = true;
		this.notifyAll();
	}
	
	public synchronized void out(){
		while(!flag){
			try {this.wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println(Thread.currentThread().getName()+"..������.."+this.name);
		flag = false;
		this.notifyAll();
	}
}

class Producer implements Runnable{
	private Resource rs;
	
	public Producer(Resource rs) {
		this.rs = rs;
	}
	
	@Override
	public void run() {
		while(true){
			rs.set("+��Ʒ+");
		}
	}
	
}

class Consumer implements Runnable{

	private Resource rs;
	
	public Consumer(Resource rs) {
		this.rs = rs;
	}
	
	@Override
	public void run() {
		while(true){
			rs.out();
		}
	}
	
	
}