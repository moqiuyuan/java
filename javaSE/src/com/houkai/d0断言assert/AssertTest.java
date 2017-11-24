package com.houkai.d0断言assert;
/**
 * assertion保证程序最基本，关键的正确性
 * */
public class AssertTest {
	public static void main(String[] args) {
		int j = 0;
		for (j = 0; j < 5; j++) {
			System.out.println(j);
		}
		--j;
		assert j==5;
	}
}
