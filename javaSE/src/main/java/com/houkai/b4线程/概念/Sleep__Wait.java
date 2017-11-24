package com.houkai.b4�߳�.����;
/**
 * sleep��Thread��ķ������ͷ�cpu�����ͷ�������ʱ�䵽���Զ��ص����߳��ϼ���ִ�У�������ͬ������ס���߳�Ҳ�޷�����
 * wait��Object��ķ������ͷ�cpu�����ͷ����������̶߳���ͬ�����Ϳ��������ˣ�ֻ�������̵߳�����notify��
 * ���߳̾ͻ�������ľ��������ǲ�������ִ�У���Ϊ��û�еõ��������˻�û���ͷţ��������ִ��notify��������
 * ����ĵõ��Ż����з���ͻ�����ȴ�
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
				Sleep__Wait.class.notify();   //wait���̵߳��ǲ����ͷ���
				System.out.println("thread2 is sleeping ten millsecond");
				
				try {
					Thread.sleep(3000);  //�ͷ���cpu��thread1����ִ����Ϊû���ͷ���
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("thread2 is going on..");
				System.out.println("thread2 is being over! ");
			}
		}
	}

}