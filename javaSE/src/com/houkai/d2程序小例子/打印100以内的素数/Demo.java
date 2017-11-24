package com.houkai.d2程序小例子.打印100以内的素数;

public class Demo {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}
	
	private static boolean isPrime(int num){
		int i = (int)Math.sqrt(num);
		for (int j = 2; j <= i; j++) {
			if(num % j == 0){
				return false;
			}
		}
		return true;
	}
}
