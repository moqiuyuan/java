package com.houkai.c6������.TCP.�﷨;

import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
	public void send(){
		try {
			 //�ƶ���Ҫ���ӵ������Ͷ˿�
			Socket socket =  new Socket("192.168.8.112",9991);  
			String str = "hahue��ihfdsafsdfhdsiochisahuf�绰";
			OutputStream out = socket.getOutputStream();
			out.write(str.getBytes());  //��������
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		new TCPClient().send();
	}
}
