package com.houkai.b2内部类;

/**
 * 2. 局部内部类 局部内部类，是指内部类定义在方法和作用域内。
 * */
public class Demo1 {
	private static int a = 0;
	public int b = 1;

	public static void main(String[] args) {
		new Demo1().test1(2, 1);
	}

	// 局部内部类一般只要是implement一些接口
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

	// 局部内部类也像别的类一样进行编译，但只是作用域不同而已，只在该方法或条件的作用域内才能使用，退出这些作用域后无法引用的。
	public void test1(int a, int b) {
		if (a > b) {
			class Dog {
				public int c;
				private int d = 3;

				public void show() {
					System.out.println("定义在局部中的内部类");
				}
			}
			new Dog().show();
		}
	}

}
