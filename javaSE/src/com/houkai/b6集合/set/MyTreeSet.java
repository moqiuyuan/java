package com.houkai.b6集合.set;

import java.util.Comparator;
import java.util.TreeSet;

//保证唯一性  需要compareTo  可以对set里面的元素进行排序
public class MyTreeSet {
	public static void main(String[] args) {
		Person1 p1 = new Person1(6, "hou");
		Person1 p2 = new Person1(1, "hou");
		
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(p1);
		ts.add(p2);
		
		for (Object object : ts) {
			Person1 p = (Person1) object;
			System.out.println(p.getAge()+"---"+p.getName());
		}
		
	/*	User u1 = new User(3, "hou");
		User u2 = new User(1, "hou");
		
		TreeSet<User> ts = new TreeSet<User>();
		ts.add(u1);
		ts.add(u2);
		for (User u : ts) {
			System.out.println(u.getId()+"---"+u.getName());
		}
		*/
		
	}
}

// 方法一   写自己的比较器          implements Comparator
class MyComparator implements Comparator<Person1>{
	
	@Override
	public int compare(Person1 p1, Person1 p2) {		
		if(p1.getAge()>p2.getAge()){
			return 1;
		}else if(p1.getAge()<p2.getAge()){
			return -1;
		}else{
			return 0;
		}
	}	
}

class Person1{
	private int age;
	private String name;
	
	public Person1(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
/**
 *  compareTo(Object o)方法是java.lang.Comparable<T>接口中的方法，
 *  当需要对某个类的对象进行排序时，该类需要实现Comparable<T>接口的，必须重写
 *  public int compareTo(T o)方法，比如MapReduce中Map函数和Reduce
 *  函数处理的 <key,value>,其中需要根据key对键值对进行排序，所以，key实现
 *  了WritableComparable<T>接口，实现这个接口可同时用于序列化和反序列化。
 *  WritableComparable<T>接口(用于序列化和反序列化)是Writable接口
 *  和Comparable<T>接口的组合；compare(Object o1,Object o2)方
 *  法是java.util.Comparator<T>接口的方法，它实际上用的是待比较对象的compareTo(Object o)方法。
 * */

//方法二  实现 Comparable
class User implements Comparable<Object>{
    int id;
    String name;
    
    public User(int id,String name){
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
       
    @Override
    public int compareTo(Object o) {
        if(this ==o){
            return 0;            
        }
        else if (o!=null && o instanceof User) {   
            User u = (User) o; 
            if(id<=u.id){
                return -1;
            }else{
            return 1;
        }
    }else{
        return -1;
    }
}
}