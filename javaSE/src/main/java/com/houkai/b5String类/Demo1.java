package com.houkai.b5String类;

public class Demo1 {
	public static void main(String[] args) {
		String s = "abc";
		StringBuffer sb = new StringBuffer();
		//---追加
		sb.append(s);
		System.out.println(sb);
		//--插入
		sb.insert(2, "123");
		System.out.println(sb);
		//--删除
		sb.delete(5, 6);
		System.out.println(sb);
		//--获取
		System.out.println(sb.indexOf("a"));
		System.out.println(sb.charAt(0));
		System.out.println(sb.length());
		System.out.println(sb.substring(2));
		//--修改
		System.out.println(sb.replace(0, 1, "A"));
		//--反转
		System.out.println(sb.reverse());
	}
}
