package com.houkai.d0����assert;
/**
 * assertion��֤������������ؼ�����ȷ��
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
