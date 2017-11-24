package com.houkai.a0设计模式.工厂设计模式.abstructfactory;

interface Washer{}
interface IceBox{}

interface Factory{
	public Washer createWasher();
	public IceBox createIceBox();
}

class WasherA implements Washer{
	public WasherA() {
		System.out.println("生产了洗衣机A");
	}
}
class WasherB implements Washer{
	public WasherB() {
		System.out.println("生产了洗衣机B");
	}
}
class IceBoxA implements IceBox{
	public IceBoxA() {
		System.out.println("生产了冰箱A");
	}
}
class IceBoxB implements IceBox{
	public IceBoxB() {
		System.out.println("生产了生产了冰箱B");
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

//重点在于分类
public class TestFactory {
	public static void main(String[] args) {
		Factory factoryA = new FactoryA();
		Factory factoryB = new FactoryB();
		factoryA.createIceBox();
		factoryB.createWasher();
	}
}
