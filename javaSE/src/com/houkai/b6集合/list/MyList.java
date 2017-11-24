package com.houkai.b6����.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MyList {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();  //����
		List<String> list2 = new LinkedList<>();  //˫������
		List<String> list3 = new ArrayList<>();  //����
		//----���
		list1.add("a");
		list1.add("c");
		list2.add("a");
		list2.add("c");
		list3.add("b");
		list3.add("c");
		//��ȡ����
		System.out.println(list1.size());
		//����
		System.out.println(list1.contains("a"));
		//�󽻼� ������ϸ����˾ͷ���true  ���򷵻�false
		System.out.println(list1.retainAll(list3));
		System.out.println(list1);  //����ΪC
		//�  ����� collection ���ڵ��ö��������ģ��򷵻� true 
		System.out.println(list2.removeAll(list3));
		System.out.println(list2);  //list2������ ��list3����û�е�
		//��ռ���
		//list2.clear();
		list1.add("1");
		list1.add("2");
		
		Iterator<String> it = list1.iterator();	
		while(it.hasNext()){
			System.out.print(it.next());
		}
		System.out.println();
		ListIterator<String> it1 = list1.listIterator();
		
		//ֻ��ListIterator ��ִ��add����
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
