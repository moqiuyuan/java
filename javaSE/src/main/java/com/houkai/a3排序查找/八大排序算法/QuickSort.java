package com.houkai.a3排序查找.八大排序算法;

import java.util.Arrays;

public class QuickSort {

	private int[]a ={1,8,12,2,6,4,0,0,0,0,0};
	
	
	public void sort(int left, int right){	
		int watcher;
		
		if(left < right){   //下标
			watcher = partition(left, right);
			sort(left,watcher-1);  //排序分界值左边的数据
			sort(watcher+1,right); //排序分界值右边的数据
		}	
	}
	
	/**
	 * 数据交换
	 */
	public void swap(int left, int right){
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}
	
	/**
	 * 获取分界值
	 */
	public int partition(int left, int right){
		int watcher = a[left]; //分界值
		
		while(left < right){
			while(left< right && a[right] >=watcher){//右边比分界值大
				right--;
			}
			swap(left, right); //数据交换
			
			while(left < right && a[left] <=watcher){
				left++;
			}
			swap(left,right);
			
		}
		return left;
	}
	
	public void show(){
		System.out.println(Arrays.toString(a));
	}
	
	
	public static void main(String[] args) {
		/*QuickSort qs = new QuickSort();
		qs.show();
		qs.sort(0, qs.a.length-1);
		qs.show();*/
		int i = 9;

	}

}
