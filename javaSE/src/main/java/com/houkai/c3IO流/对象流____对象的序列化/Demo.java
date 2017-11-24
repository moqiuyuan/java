package com.houkai.c3IO��.������____��������л�;

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
			System.out.println(p.name);  //nameû�д��룬ֻ����age
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

//Ҫ������ļ��������л�---�ֽд��л�
class Person implements Serializable{
	public static final long serialVersionUID=42L;
	transient String name;   //�Ǿ�̬�Ĳ���������л��Ŀ�����transient����  name ����浽�ļ�����ȥ
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
