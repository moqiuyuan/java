package com.houkai.b5String��;

public class Demo1 {
	public static void main(String[] args) {
		String s = "abc";
		StringBuffer sb = new StringBuffer();
		//---׷��
		sb.append(s);
		System.out.println(sb);
		//--����
		sb.insert(2, "123");
		System.out.println(sb);
		//--ɾ��
		sb.delete(5, 6);
		System.out.println(sb);
		//--��ȡ
		System.out.println(sb.indexOf("a"));
		System.out.println(sb.charAt(0));
		System.out.println(sb.length());
		System.out.println(sb.substring(2));
		//--�޸�
		System.out.println(sb.replace(0, 1, "A"));
		//--��ת
		System.out.println(sb.reverse());
	}
}
