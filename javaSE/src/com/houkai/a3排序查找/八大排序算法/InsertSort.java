package com.houkai.a3�������.�˴������㷨;

import java.util.Arrays;

public class InsertSort {
	private int[] a = {1,2,4,0,3,3,2,5,8,1};
	
	public void sort(){
		for (int i = 1; i < a.length; i++) {
			int watcher = a[i];
			int j;
			for (j = i-1; j >= 0; j--) {
				if(watcher < a[j]){  //��ǰ����Ƿ����Ĵ�
					a[j+1] = a[j];    //
				}else{   //˳����ͬ���������
					break;
				}
			}
			a[j+1] = watcher;
		}
		 System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		InsertSort in = new InsertSort();
		in.sort();
	}
}
