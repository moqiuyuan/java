package com.houkai.b6集合.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("pp");
		System.out.println(list);
		//Collections.sort(list);
		Collections.sort(list,new StrLenComparator());
		System.out.println(list);
		
		//Collections.max(list);
		Collections.max(list,new StrLenComparator());
		System.out.println(list);
		
		int a = Collections.binarySearch(list, "pp");  //返回插入点-1
		System.out.println(a);
		
		for (int i = 0; i < 10; i++) {
			Collections.shuffle(list);  //将集合中的内容重新排序
			System.out.println(list);
		}
		
	}
}

class StrLenComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length()>s2.length()){
			return 1;
		}else if(s1.length()<s2.length()){
			return -1;
		}else{
			return 0;
		}	
	}
	
}
