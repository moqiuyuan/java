package com.houkai.b3�쳣;

public class MyThrow {
	public int devide(int a,int b) throws Exception{
		int c = 0;
		c = a/b;
		return c;

	}
	//�쳣�����try catch ���� �����׳�  ��ô�����е����߲�(bu)׽  ����ʱ�쳣�׳����Բ�������
	public static void main(String[] args) {
		int d = 0;
		try {
			d = new MyThrow().devide(2, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(d);
	}
}
