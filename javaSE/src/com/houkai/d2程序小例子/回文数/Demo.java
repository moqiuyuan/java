package com.houkai.d2程序小例子.回文数;

public class Demo {
	public static void main(String[] args) {
		for (int i = 10; i < 10000; i++) {
			if(isCircleNumber(i)){
				System.out.println(i);
			}
		}
	}
	
	private static boolean isCircleNumber(int num){
		int oldNum = num;
		int temp = 0;    //反过来的值 初始化为0
		while(num > 0){
			temp = temp*10 + num%10;
			num/=10;
		}
		return oldNum == temp;
		
	} 
}
