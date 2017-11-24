package com.houkai.c6ÍøÂç±à³Ì;

import java.net.InetAddress;

public class MethodDemo {
	public static void main(String[] args) {
		try {
			InetAddress i = InetAddress.getLocalHost();
			System.out.println(i.toString());
			System.out.println(i.getAddress());
			System.out.println(i.getHostName());
			
			InetAddress ii = InetAddress.getByName("WIN-S8G4JP0TPVT");
			System.out.println(ii);
			
			InetAddress iii = InetAddress.getByName("www.baidu.com");
			System.out.println(iii);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
