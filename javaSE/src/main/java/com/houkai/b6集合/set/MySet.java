package com.houkai.b6����.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//set ��Ϊtreeset  hashset
public class MySet {

	public static void main(String[] args) {
		Set<String> set = new TreeSet();
		set.add("aa");
		set.add("bb");
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
	}
}


