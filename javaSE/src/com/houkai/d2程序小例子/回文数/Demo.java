package com.houkai.d2����С����.������;

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
		int temp = 0;    //��������ֵ ��ʼ��Ϊ0
		while(num > 0){
			temp = temp*10 + num%10;
			num/=10;
		}
		return oldNum == temp;
		
	} 
}
