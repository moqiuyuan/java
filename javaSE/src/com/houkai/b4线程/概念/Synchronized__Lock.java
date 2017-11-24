package com.houkai.b4线程.概念;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 相同点：Lock能完成synchroned所实现的所有的功能
 * 不同点：Lock有更精确的线程语意和更好的功能，synchronized会自动释放锁而Lock是通过手动释放锁的，而且必须在finally
 * 		里面释放锁
 * */
public class Synchronized__Lock {
	private int i;
	//Creates an instance of ReentrantLock. 
	//This is equivalent to using ReentrantLock
	private Lock lock = new ReentrantLock();
	
	public static void main(String[] args){
		Synchronized__Lock thread = new Synchronized__Lock();
		for (int i = 0; i < 2; i++) {
			new Thread(thread.new Thread2()).start();
			new Thread(thread.new Thread1()).start();
			
		}
	}
	
	private class Thread1 implements Runnable{

		@Override
		public void run() {
			while(true){
				lock.lock();
				try{
					System.out.println("i--="+i--);
				}finally{
					lock.unlock();  //Releases the lock. 
				}
			}
			
		}
		
	}
	
	private class Thread2 implements Runnable{

		@Override
		public void run() {
			while(true){				
				lock.lock();
				try{
					System.out.println("i++="+i++);
				}finally{
					lock.unlock();  //Releases the lock. 
				}			
			}
			
		}
		
	}
	
	
	
}
