package com.houkai.c6������.UDP.�﷨;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend{
	//���Ͷ�   
	public void send(){
		try {
			DatagramSocket ds = new DatagramSocket(9990);
			String s = "999iiiiooooyyyy";   
			//�Է���IP�Ͷ˿�
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
	

	
