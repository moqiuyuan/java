package com.houkai.c6������.UDP.�﷨;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {
	//���ն�  Ӧ�ȿ����� ��Ϊreceive ����������  ���ղ�������������ͣ
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
