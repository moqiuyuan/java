package com.houkai.b2�ڲ���;

/**
 * 2. �ֲ��ڲ��� �ֲ��ڲ��࣬��ָ�ڲ��ඨ���ڷ������������ڡ�
 * */
public class Demo1 {
	private static int a = 0;
	public int b = 1;

	public static void main(String[] args) {
		new Demo1().test1(2, 1);
	}

	// �ֲ��ڲ���һ��ֻҪ��implementһЩ�ӿ�
	public Object test(final int num) {
		class Dog {
			public int c;
			private int d = 3;

			public void getC() {
				System.out.println(a + "----" + b);
			}

			public Dog() {
				this.c = num;
			}
		}
		return new Dog();
	}

	// �ֲ��ڲ���Ҳ������һ�����б��룬��ֻ��������ͬ���ѣ�ֻ�ڸ÷������������������ڲ���ʹ�ã��˳���Щ��������޷����õġ�
	public void test1(int a, int b) {
		if (a > b) {
			class Dog {
				public int c;
				private int d = 3;

				public void show() {
					System.out.println("�����ھֲ��е��ڲ���");
				}
			}
			new Dog().show();
		}
	}

}
