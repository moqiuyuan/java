package com.houkai.c6网络编程.TCP.语法;

import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
	public void send(){
		try {
			 //制定需要连接的主机和端口
			Socket socket =  new Socket("192.168.8.112",9991);  
			String str = "hahue我ihfdsafsdfhdsiochisahuf电话";
			OutputStream out = socket.getOutputStream();
			out.write(str.getBytes());  //发出数据
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		new TCPClient().send();
	}
}
