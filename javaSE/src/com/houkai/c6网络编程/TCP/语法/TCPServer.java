package com.houkai.c6ÍøÂç±à³Ì.TCP.Óï·¨;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public void Receive(){
		try {
			ServerSocket serverSocket = new ServerSocket(9991);
			Socket socket = serverSocket.accept();
			//String ip =  serverSocket.getInetAddress().getHostAddress();
			InputStream is = socket.getInputStream();
			byte[] buf = new byte[1024];
			//Reads some number of bytes from the input stream 
			//and stores them into the buffer array b.
			int len = is.read(buf);  		
			String str = new String(buf,0,len);
			System.out.println(str);	               
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new TCPServer().Receive();
	}
}
