package com.houkai.b5String��;

public class Demo {
	public static void main(String[] args) {
		String str = "1234abcdefghi56781234";
		String s = new String("1234abcdefghi56781234");		
		String s1 = "1234abcdefghi56781234";
		
		System.out.println(str == s);
		System.out.println(str.equals(s));
		System.out.println(s1==str);
		//----------------------------------------------
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));  //��3��λ���ϵ�char
		System.out.println(s1.indexOf("1")); //�����һ��λ���ϵ�1
		System.out.println(s1.indexOf("1",2)); //����ڶ���λ���ϵ�1
		System.out.println(s1.lastIndexOf("1", 2));   //����ڶ���λ���ϵ�1
		//-----------------------------------------------
		System.out.println(s1.contains("hh")); 
		System.out.println(s1.indexOf("ii"));  //����-1��ʾû���ҵ�
		String[] s3 = s1.split("i");
		for (String s4 : s3) {
			System.out.print(s4+"----");
		}
		System.out.println("\r\n"+s1.endsWith("34"));
		//ת��------------------
		byte[] b = s1.getBytes();
		for (byte c : b) {
			System.out.print(c+"--");   //�����ascall��
		}
		System.out.println("\n");
		char[] c = s1.toCharArray();
		for (char d : c) {
			System.out.print(d+"---");
		}
		System.out.println("r\n"+s1.toUpperCase());
		System.out.println(s1.compareTo("abcdefghi"));  //�Ƚϴ�С
		//�滻------------------
		System.out.println(s1.replace("a", "AAAA"));
		//�Ӵ�------------------
		System.out.println(s1.substring(9));
		System.out.println(s1.substring(1, 3));
		
	}

}
