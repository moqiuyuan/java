package com.houkai.d2����С����.�˷��ھ���;

public class Demo {
	public static void main(String[] args) {
		for (int i = 1, j = 1; j <= 9; i++) {  //n^2
			System.out.print(i+"*"+j+"="+i*j+"\t");
			if(i==j){
				j++;
				i=0;
				System.out.println();
			}
		}
	}
}
