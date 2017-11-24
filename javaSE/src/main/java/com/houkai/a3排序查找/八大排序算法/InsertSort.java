package com.houkai.a3排序查找.八大排序算法;

import java.util.Arrays;

public class InsertSort {
	private int[] a = {1,2,4,0,3,3,2,5,8,1};
	
	public void sort(){
		for (int i = 1; i < a.length; i++) {
			int watcher = a[i];
			int j;
			for (j = i-1; j >= 0; j--) {
				if(watcher < a[j]){  //看前面的是否后面的大
					a[j+1] = a[j];    //
				}else{   //顺序相同不用向后移
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
