package com.houkai.b6集合.set;

import java.util.HashSet;

//保证唯一性  需要重写hashcode  和  equals
public class MyHashSet {
	public static void main(String[] args) {
		Person p = new Person(11,"hou");
		Person p1 = new Person(11, "hou");
		HashSet set = new HashSet<>();
		set.add(p1);
		set.add(p);
		set.add("0000");
		
		for (Object o : set) {
			System.out.println(o);
		}
		
	}
}

class Person{
	private int age;
	private String name;
	
	public Person(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)){
			return false;
		}
		
		Person p = (Person)obj;
		if(p.name.equals(this.name) && p.age == this.age){
			return true;
		}else{
			return false;
		}
	}
}
