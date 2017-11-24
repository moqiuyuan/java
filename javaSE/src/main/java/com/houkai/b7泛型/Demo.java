package com.houkai.b7∑∫–Õ;
/**
 * ∑∫–Õ¿‡
 * */
public class Demo {
	public static void main(String[] args) {
		Util<Worker> u = new Util<Worker>();
		u.setObject(new Worker());
		Worker w = u.getObject();
		System.out.println(w.a);
	}
}

class Worker{
	public int a = 1;
}
class Student{}

class Util<QQ>{
	private QQ qq;
	public void setObject(QQ qq){
		this.qq = qq;
	}
	
	public QQ getObject(){
		return qq;
	}
	
}
