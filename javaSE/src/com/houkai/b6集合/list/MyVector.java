package com.houkai.b6¼¯ºÏ.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class MyVector {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("aa");
		v.add("bb");
		v.add("cc");
		for (String s : v) {
			System.out.print(s);
		}
		System.out.println();
		
		//----------------------------
		Iterator<String> it = v.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
		System.out.println();
		
		//----Ã¶¾Ù----------------------
		Enumeration<String> en = v.elements();
		while(en.hasMoreElements()){
			System.out.print(en.nextElement());
		}
		System.out.println();
	}
}
