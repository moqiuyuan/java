package com.houkai.c2Math;
import static java.lang.Math.*;  //æ≤Ã¨µº»Î

import java.util.Random;

public class Demo {
	public static void main(String[] args) {
		System.out.println(ceil(4.1));
		System.out.println(floor(4.7));
		System.out.println(round(5.4));
		System.out.println(round(5.6));
		
		double a = random();
		System.out.println(a);
		
		//-------------
		Random r = new Random();
		int i = r.nextInt(10);
		System.out.println(i);
	}
}
