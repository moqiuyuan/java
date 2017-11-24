package com.houkai.b7·ºÐÍ;

public class Demo1 {
	public static void main(String[] args) {
		int a = 1;
		U u = new U();
		u.print(a);
		u.print("asnbvf");
	}
}

class U{
	public<T> void print(T t){
		System.out.println("show--"+t);
	}
}
