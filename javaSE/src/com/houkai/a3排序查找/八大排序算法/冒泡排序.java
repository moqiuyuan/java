package com.houkai.a3≈≈–Ú≤È’“.∞À¥Û≈≈–ÚÀ„∑®;

public class √∞≈›≈≈–Ú {
	public static void main(String[] args) {
		int[] a = {1,3,2,4,2,4,6,9,11,4,5,7,8};
		sort(a);
	}
	
	public static void sort(int[] a){
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1]){
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j]^a[j+1];
					a[j] = a[j]^a[j+1];
				}
			}
		}
		
		for (int i : a) {
			System.out.print(i+"  ");
		}
	}
}
