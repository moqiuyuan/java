package com.houkai.b4�߳�;
/**
 * ���4���̣߳�����������i��һ ����������i��һ
 * */
public class Demo1 {
	private int j;
	public static void main(String[] args) {
		Demo1 d = new Demo1();	
		Inc inc = d.new Inc();
		Dec dec = d.new Dec();
		for (int i = 0; i < 2; i++) {
			new Thread(dec).start();
			new Thread(inc).start();		
		}
		System.out.println(d.j);
	}
	
	 private class Inc implements Runnable{
		@Override
		public void run() {
			synchronized(this){
				for (int i = 0; i < 100; i++) {
					j++;
					System.out.println(Thread.currentThread().getName()+"-inc"+j);
				}
			}
			
		}
	}
	
	private class Dec implements Runnable{
		@Override
		public void run() {
			synchronized(this){
				for (int i = 0; i < 100; i++) {
					j--;
					System.out.println(Thread.currentThread().getName()+"-Dec"+j);
				}
				
			}
			
		}
	}
}
