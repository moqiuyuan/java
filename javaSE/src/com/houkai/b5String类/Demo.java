package com.houkai.b5String类;

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
		System.out.println(s1.charAt(2));  //第3个位置上的char
		System.out.println(s1.indexOf("1")); //正向第一个位置上的1
		System.out.println(s1.indexOf("1",2)); //正向第二个位置上的1
		System.out.println(s1.lastIndexOf("1", 2));   //反向第二个位置上的1
		//-----------------------------------------------
		System.out.println(s1.contains("hh")); 
		System.out.println(s1.indexOf("ii"));  //返回-1表示没有找到
		String[] s3 = s1.split("i");
		for (String s4 : s3) {
			System.out.print(s4+"----");
		}
		System.out.println("\r\n"+s1.endsWith("34"));
		//转换------------------
		byte[] b = s1.getBytes();
		for (byte c : b) {
			System.out.print(c+"--");   //这个是ascall码
		}
		System.out.println("\n");
		char[] c = s1.toCharArray();
		for (char d : c) {
			System.out.print(d+"---");
		}
		System.out.println("r\n"+s1.toUpperCase());
		System.out.println(s1.compareTo("abcdefghi"));  //比较大小
		//替换------------------
		System.out.println(s1.replace("a", "AAAA"));
		//子串------------------
		System.out.println(s1.substring(9));
		System.out.println(s1.substring(1, 3));
		
	}

}
