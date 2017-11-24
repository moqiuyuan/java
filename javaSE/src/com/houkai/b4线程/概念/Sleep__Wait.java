package com.houkai.b4线程.概念;
/**
 * sleep是Thread类的方法，释放cpu而不释放锁，当时间到后自动回到该线程上继续执行，其他被同步锁挡住的线程也无法运行
 * wait是Object类的方法，释放cpu并且释放锁，其他线程饿到同步锁就可以运行了，只有其他线程调用了notify后
 * 该线程就会参与锁的竞争，但是不会立即执行，因为还没有得到锁，被人还没有释放，还会继续执行notify后面的语句
 * 如果的得到才会运行否则就会继续等待
 * */
public class Sleep__Wait {
	
	public static void main(String[] args) {
		new Thread(new Thread1()).start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Thread2().start();
	}
	
	private static class Thread1 implements Runnable{
	
		@Override
		public void run() {
			synchronized(Sleep__Wait.class){
				System.out.println("enterThread1...");
				System.out.println("thread1 is waiting...");
				try {
					Sleep__Wait.class.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("thread1 is going on..");
				System.out.println("thread1 is being over! ");
			}
		}	
	}  
	
	private static class Thread2 extends Thread{
		@Override
		public void run() {
			synchronized(Sleep__Wait.class){
				System.out.println("enterThread2...");
				System.out.println("thread2 notify other thread can release wait status...");
				Sleep__Wait.class.notify();   //wait的线程但是并不释放锁
				System.out.println("thread2 is sleeping ten millsecond");
				
				try {
					Thread.sleep(3000);  //释放了cpu但thread1不会执行因为没有释放锁
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("thread2 is going on..");
				System.out.println("thread2 is being over! ");
			}
		}
	}

}