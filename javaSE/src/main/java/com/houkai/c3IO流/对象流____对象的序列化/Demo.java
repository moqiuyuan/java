package com.houkai.c3IO流.对象流____对象的序列化;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//ObjectInputStream   ObjectOutputStream
class Test{
	public void writeObj(){
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("H:\\obj.txt"));
			oos.writeObject(new Person("houkai", 22));
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public void readObj(){
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("H:\\obj.txt"));
			Person p = (Person) ois.readObject();
			System.out.println(p.name);  //name没有存入，只存了age
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

//要想存入文件必须序列化---又叫串行化
class Person implements Serializable{
	public static final long serialVersionUID=42L;
	transient String name;   //非静态的不想对其序列化的可以用transient修饰  name 不会存到文件里面去
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
}

public class Demo {
	public static void main(String[] args) {
		Test t = new Test();
		t.writeObj();
		t.readObj();		
	}
}
