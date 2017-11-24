package com.houkai.b8数组工具Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		//数组变集合
		list = Arrays.asList(1,2,3,4);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		//集合变数组
		Object[] i = list.toArray();
		for (Object object : i) {
			System.out.println(object);
		}
		
	}
}
