package com.houkai.a2数制转换数组;

public class 进制转换 {
	public static void main(String[] args) {
		//trans(10,15,4);   
		trans(7,1,1);
	}
	
	//num 是10进制数    base基  1   7   15    offset偏移量  1  3  4
	public static void trans(int num,int base,int offset){
		char[] ch = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		char[] arr = new char[32];
		int pos = arr.length;
		if(num == 0){
			System.out.println(0);
		}
		
		while(num!=0){
			int temp = num & base;
			arr[--pos] = ch[temp];
			num = num >>> offset;
		}
		
		for (int i = pos; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
