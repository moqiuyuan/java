package com.houkai.b3�쳣;

public class MyThrowable {
	
	public int devide(int a,int b){
		int c = 0;
		try{
			c = a/b;
			return c;
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("-------------------------------");
			e.printStackTrace();
		}finally{
			System.out.println("--------finally-------");
		}
		return 111;	
	}
	//finally ��return֮ǰִ�� ��ʹ�쳣����Ҳ��ִ��
	
	public static void main(String[] args) {
		
		int d = new MyThrowable().devide(2, 1);
		System.out.println(d);
	}
	
	
}
