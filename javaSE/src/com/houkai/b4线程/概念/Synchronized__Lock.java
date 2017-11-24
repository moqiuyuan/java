package com.houkai.b4�߳�.����;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ��ͬ�㣺Lock�����synchroned��ʵ�ֵ����еĹ���
 * ��ͬ�㣺Lock�и���ȷ���߳�����͸��õĹ��ܣ�synchronized���Զ��ͷ�����Lock��ͨ���ֶ��ͷ����ģ����ұ�����finally
 * 		�����ͷ���
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
