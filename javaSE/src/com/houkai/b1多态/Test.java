package com.houkai.b1��̬;

public class Test {
	public static void main(String[] args) {
		//����ָ���������  �Ϳ����ø�������͵���������д����ķ���
		//ǰ�᣺���า�Ǹ���ķ���
		People man = new Man();	
		man.work();
		
		//a instanceof A  a��A��������
		if(man instanceof People){
			System.out.println("man �� People ����");
		}
		
	}
}
