package com.houkai.c3IO��.�ֽ���.���̶�ȡ;

import java.io.InputStream;

public class Demo1 {
	public static void main(String[] args) {
		InputStream is = System.in;
		StringBuffer sb = new StringBuffer();
		try{//\r�ǻس���,\n�ǻ��з�    ����
			while(true){
				int ch=is.read();
				if(ch=='\r'){
					System.out.println("-----");
					continue;
				}
				
				if(ch=='\n'){
					String s = sb.toString();
					if("Over".equals(s)){
						break;
					}
					System.out.println(s.toUpperCase());
					sb.delete(0, sb.length());  //�����ͽ�ԭ���е�ɾ��
				}else{
					sb.append((char)ch);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
