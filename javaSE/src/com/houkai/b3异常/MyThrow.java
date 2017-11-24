package com.houkai.b3异常;

public class MyThrow {
	public int devide(int a,int b) throws Exception{
		int c = 0;
		c = a/b;
		return c;

	}
	//异常如果不try catch 处理 可以抛出  那么可以有调用者捕(bu)捉  运行时异常抛出可以不用声明
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
