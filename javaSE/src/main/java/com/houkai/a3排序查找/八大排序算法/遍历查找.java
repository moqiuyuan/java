package com.houkai.a3�������.�˴������㷨;

public class �������� {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		boolean is = find(a,22);
		System.out.println(is);
	}
	
	public static boolean find(int[] a,int b){
		for (int i : a) {
			if(i==b){
				return true;
			}
		}
		return false;
	}
}
