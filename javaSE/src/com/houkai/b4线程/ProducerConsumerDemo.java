package com.houkai.b4线程;

public class ProducerConsumerDemo {
	public static void main(String[] args) {
		Resource r = new Resource();
		
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(c);
		Thread t4 = new Thread(c);
		
		t1.setName("我是线程一");	
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();	
		
	}
}

//同步是对对资源加锁的
class Resource{
	private String name;
	private int count = 1;
	private boolean flag = false;
	
	//wait()释放资源释放锁      sleep()释放资源不释放锁
	public synchronized void set(String name){
		//false表示没有东西 就会生产东西  有东西 那么就释放锁
		while(flag){
			try {this.wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		
		this.name = name+"---"+count++;
		System.out.println(Thread.currentThread().getName()+"..生产者.."+this.name);
		flag = true;
		this.notifyAll();
	}
	
	public synchronized void out(){
		while(!flag){
			try {this.wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println(Thread.currentThread().getName()+"..消费者.."+this.name);
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
			rs.set("+商品+");
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