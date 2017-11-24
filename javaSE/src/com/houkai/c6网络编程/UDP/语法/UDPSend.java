package com.houkai.c6网络编程.UDP.语法;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend{
	//发送端   
	public void send(){
		try {
			DatagramSocket ds = new DatagramSocket(9990);
			String s = "999iiiiooooyyyy";   
			//对方的IP和端口
			DatagramPacket pd = new DatagramPacket(s.getBytes(),s.getBytes().length,InetAddress.getByName("192.168.8.112"),9991);
			ds.send(pd);
			ds.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new UDPSend().send();
	}
}	
	

	
