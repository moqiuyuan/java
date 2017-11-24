package com.houkai.d1≥Ã–Ú≤ÈÀ„∑®;

public class Test1{
    public static synchronized void main(String[] a){
        Thread t=new Thread(){
            public void run(){Sogou();}
    };
    t.run();
    System.out.print("Hello");
    }
    static synchronized void Sogou(){
    System.out.print("Sogou");
   }
}
