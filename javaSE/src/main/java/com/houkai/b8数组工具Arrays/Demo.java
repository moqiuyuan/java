package com.houkai.b8���鹤��Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		//����伯��
		list = Arrays.asList(1,2,3,4);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		//���ϱ�����
		Object[] i = list.toArray();
		for (Object object : i) {
			System.out.println(object);
		}
		
	}
}
