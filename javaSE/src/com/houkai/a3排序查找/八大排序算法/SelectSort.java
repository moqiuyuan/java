package com.houkai.a3�������.�˴������㷨;

import java.util.Arrays;

public class SelectSort {
	private int[] a = {1,2,4,0,3,3,2,5,8,1};
	
	//ʱ�临�Ӷ�    O()
	public void sort(){
		for (int i = 0; i < a.length; i++) {
			int max = a[i];
			int index = i;			
			for(int j = i+1; j < a.length; j++) {
				if(max>a[j]){
					max = a[j];
					index = j;
				}
			}
			a[index] =a [i];
			a[i] = max;
		}
		System.out.println(Arrays.toString(a));
	}
	
	//�ҳ��ڶ��������
	public void secondMax(){
		int max = a[0];
		int secondMax = a[0];
		
		for(int i = 0; i < a.length-1;i++){
			if(a[i]>max){
				secondMax = max;
				max = a[i];
			}else if(a[i]>secondMax && a[i]<max){
				secondMax = a[i];
			}
		}
		
		System.out.println("�ڶ��������ǣ�"+secondMax);
	}
	
	public static void main(String[] args) {
		new SelectSort().secondMax();
	}
}
