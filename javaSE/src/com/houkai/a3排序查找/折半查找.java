package com.houkai.a3排序查找;

public class 折半查找 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		boolean is = find(a,1);
		System.out.println(is);
	}
	
	public static boolean find(int[] a,int b){
		int min = 0;
		int max = a.length-1;
		int mid = 0;
		while(min <= max){
			//折半遍历遍历的是下标   
			mid = (min+max)>>2;
			if(a[mid]<b){
				min = mid+1;
			}else if(a[mid]>b){
				max = mid-1;
			}else{
				return true;
			}
		}
		
		return false;
	}
}
