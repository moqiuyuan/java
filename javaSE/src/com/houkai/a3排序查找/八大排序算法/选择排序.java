package com.houkai.a3≈≈–Ú≤È’“.∞À¥Û≈≈–ÚÀ„∑®;

public class —°‘Ò≈≈–Ú {
	public static void main(String[] args) {
		int[] a = {1,3,2,4,2,4,6,9,11,4,5,7,8};
		sort(a);
	}
	
	public static void sort(int[] a){
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					a[j] = a[j]^a[i];
					a[i] = a[j]^a[i];
					a[j] = a[j]^a[i];
				}
			}
		}
		
		for (int i : a) {
			System.out.print(i+"  ");
		}
	}
}
