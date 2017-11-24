package com.houkai.b6集合.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MyList {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();  //数组
		List<String> list2 = new LinkedList<>();  //双向链表
		List<String> list3 = new ArrayList<>();  //数组
		//----添加
		list1.add("a");
		list1.add("c");
		list2.add("a");
		list2.add("c");
		list3.add("b");
		list3.add("c");
		//获取个数
		System.out.println(list1.size());
		//包含
		System.out.println(list1.contains("a"));
		//求交集 如果集合更改了就返回true  否则返回false
		System.out.println(list1.retainAll(list3));
		System.out.println(list1);  //交集为C
		//差集  如果此 collection 由于调用而发生更改，则返回 true 
		System.out.println(list2.removeAll(list3));
		System.out.println(list2);  //list2里面有 而list3里面没有的
		//清空集合
		//list2.clear();
		list1.add("1");
		list1.add("2");
		
		Iterator<String> it = list1.iterator();	
		while(it.hasNext()){
			System.out.print(it.next());
		}
		System.out.println();
		ListIterator<String> it1 = list1.listIterator();
		
		//只有ListIterator 能执行add操作
		while(it1.hasNext()){
			System.out.print(it1.next());
			it1.add("a");
		}
		System.out.println();
		while(it1.hasPrevious()){
			System.out.print(it1.previous());
		}

		System.out.println();
		for (String s : list1) {
			System.out.print(s);
		}
	}
}
