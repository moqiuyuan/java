package com.houkai.b2�ڲ���;
/**
 *�����ڲ��� 
 * */
public class Demo2 {
	private int c;
	public static void main(String[] args) {
		int d = new Demo2().test(1, 2);
		System.out.println(d); 
	}
	
	//�����ڲ���Ĵ��ھ���Ϊ��ʵ�ֽӿڻ��߳��󷽷�
	public int test(final int a,final int b){
		return new Inner(){
			@Override
			public int add() {
				c = a + b;
				return c;
			}
		}.add();   //ע������и��ֺ�
		
		
	}
}

interface Inner{
	abstract public int add();
}