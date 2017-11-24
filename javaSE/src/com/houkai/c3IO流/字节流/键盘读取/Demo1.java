package com.houkai.c3IO流.字节流.键盘读取;

import java.io.InputStream;

public class Demo1 {
	public static void main(String[] args) {
		InputStream is = System.in;
		StringBuffer sb = new StringBuffer();
		try{//\r是回车符,\n是换行符    打汉字
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
					sb.delete(0, sb.length());  //输出后就将原来有的删除
				}else{
					sb.append((char)ch);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
