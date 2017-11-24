package com.houkai.a3�������.�˴������㷨;

import java.util.Arrays;

public class BubbleSort {
	private int[] a = {1,2,4,0,3,3,2,5,8,1};
	
	//ʱ�临�Ӷ�    O(n^2)
	public void sort(){
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1]){
					a[j]^=a[j+1];
					a[j+1]^=a[j];
					a[j]^=a[j+1];
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	//�㷨�Ľ�
	public void sort1(){
		boolean flag = true;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1]){
					a[j]^=a[j+1];
					a[j+1]^=a[j];
					a[j]^=a[j+1];
					flag = false;
				}
			}
			
			if(flag){
				break;
			}
			
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		b.sort();
		b.sort1();
	}
}
