package com.houkai.b6����.set;

import java.util.Comparator;
import java.util.TreeSet;

//��֤Ψһ��  ��ҪcompareTo  ���Զ�set�����Ԫ�ؽ�������
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

// ����һ   д�Լ��ıȽ���          implements Comparator
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
 *  compareTo(Object o)������java.lang.Comparable<T>�ӿ��еķ�����
 *  ����Ҫ��ĳ����Ķ����������ʱ��������Ҫʵ��Comparable<T>�ӿڵģ�������д
 *  public int compareTo(T o)����������MapReduce��Map������Reduce
 *  ��������� <key,value>,������Ҫ����key�Լ�ֵ�Խ����������ԣ�keyʵ��
 *  ��WritableComparable<T>�ӿڣ�ʵ������ӿڿ�ͬʱ�������л��ͷ����л���
 *  WritableComparable<T>�ӿ�(�������л��ͷ����л�)��Writable�ӿ�
 *  ��Comparable<T>�ӿڵ���ϣ�compare(Object o1,Object o2)��
 *  ����java.util.Comparator<T>�ӿڵķ�������ʵ�����õ��Ǵ��Ƚ϶����compareTo(Object o)������
 * */

//������  ʵ�� Comparable
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