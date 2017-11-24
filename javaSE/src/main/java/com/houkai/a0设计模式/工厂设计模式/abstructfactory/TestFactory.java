package com.houkai.a0���ģʽ.�������ģʽ.abstructfactory;

interface Washer{}
interface IceBox{}

interface Factory{
	public Washer createWasher();
	public IceBox createIceBox();
}

class WasherA implements Washer{
	public WasherA() {
		System.out.println("������ϴ�»�A");
	}
}
class WasherB implements Washer{
	public WasherB() {
		System.out.println("������ϴ�»�B");
	}
}
class IceBoxA implements IceBox{
	public IceBoxA() {
		System.out.println("�����˱���A");
	}
}
class IceBoxB implements IceBox{
	public IceBoxB() {
		System.out.println("�����������˱���B");
	}
}

class FactoryA implements Factory{
	@Override
	public Washer createWasher() {		
		return new WasherA();
	}
	@Override
	public IceBox createIceBox() {		
		return new IceBoxA();
	}
}

class FactoryB implements Factory{
	@Override
	public Washer createWasher() {
		return new WasherB();
	}
	@Override
	public IceBox createIceBox() {
		return new IceBoxB();
	}
	
}

//�ص����ڷ���
public class TestFactory {
	public static void main(String[] args) {
		Factory factoryA = new FactoryA();
		Factory factoryB = new FactoryB();
		factoryA.createIceBox();
		factoryB.createWasher();
	}
}
