package com.houkai.c6网络编程.UDP.语法;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {
	//接收端  应先开接收 因为receive 是阻塞方法  接收不到服务器不会停
	public void receive(){
		try {
			DatagramSocket ds = new DatagramSocket(9991);
			byte[] buf = new byte[1024];
			DatagramPacket pd = new DatagramPacket(buf,buf.length);
			ds.receive(pd);
			String s = new String(pd.getData(),0,pd.getLength());
			System.out.println(s);
			ds.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new UDPReceive().receive();
	}
}
