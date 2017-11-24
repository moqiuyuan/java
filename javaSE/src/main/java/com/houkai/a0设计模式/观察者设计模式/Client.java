package com.houkai.a0设计模式.观察者设计模式;

import java.util.Vector;

/**老师又电话号码，学生需要知道老师的电话号码以便于在合时的时候拨打，在这样的组合中，老师就是一个被观察者
（Subject），学生就是需要知道信息的观察者，当老师的电话号码发生改变时，学生得到通知，并更新相应的电话记
录。
*/
interface Subject{   //目标
	public void attach(Observer o);   //注册用户
    public void detach(Observer o);   //删除用户   [dɪ'tætʃ] 分离派遣
    public void notice();             //提醒用户
}

interface Observer{   //观察者
	public void update();    
}

//老师相当于目标
class Teacher implements Subject{
	private String phone;
	private Vector<Observer> students;
	
	public Teacher() {
		phone = "";
		students = new Vector<Observer>();
	}
	
	@Override
	public void attach(Observer o) {
		students.add(o);   //添加学生
	}

	@Override
	public void detach(Observer o) {
		students.remove(o);   //删除学生
	}

	@Override
	public void notice() {
		for (int i = 0; i < students.size(); i++) {
			((Observer)students.get(i)).update();
		}
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		notice();    //关键点   ，电话号改变通知所有的学生
	}
	
}

//学生相当于观察者
class Student implements Observer{
	private String phone;
	private Teacher teacher;
	private String name;
	
	public Student(String name,Teacher t) {
		this.name = name;
		this.teacher = t;
	}
	
	public void show(){
		System.out.println("姓名"+name+"\t老师的手机号码"+phone);
	}

	@Override
	public void update() {
		phone = teacher.getPhone();
	}
}

public class Client {
	public static void main(String[] args) {
		Vector<Student> students = new Vector<Student>();
	    Teacher t = new Teacher();
	       for(int i= 0 ;i<3;i++){
	           Student st = new Student("S"+i,t);
	           students.add(st);   //student 放入集合中
	           t.attach(st);       //将创建的学生注册到老师中去
	       }
	       
	       t.setPhone("88803807");
	       
	       for(int i=0;i<3;i++){
	    	  ((Student)students.get(i)).show();
	       }
	           
	       t.setPhone("88808880");  //修改老师的手机号
	      
	       for(int i=0;i<3;i++){
	    	  ((Student)students.get(i)).show();
	       }
	          
	    }	
}
