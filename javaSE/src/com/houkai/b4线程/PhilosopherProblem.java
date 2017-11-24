package com.houkai.b4线程;
//信号量
class Semaphore {
    int status;             //筷子当前状态
    int num;                //筷子编号
    public Semaphore(int status, int num) {    //筷子信号量
        this.status = status;
        this.num = num;
    }
}

public class PhilosopherProblem {
	//5个人 5支筷子
    static Semaphore fork[] = new Semaphore[5];
    philosopher p[] = new philosopher[5];
    int pw[] = new int[5];  //记录哪根筷子有哲学家在等待
     
 
    public synchronized void P(philosopher phi, Semaphore fork) {   //p操作
        fork.status--;
         
        if (fork.status < 0) {
            try {
                pw[fork.num] = phi.num;//当筷子已经被占用的时候，用pw来记录哪根筷子有哲学家在等待。
                    this.wait();                     
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
 
    public synchronized void V(philosopher phi, Semaphore fork) {  //V操作
        fork.status++;
        if (fork.status <= 0) {             
            if (pw[fork.status] != -1) {//如果刚放下的筷子中有哲学家在等，则查看pw中是哪个哲学家，然后再运行这个哲学家程   
                //notifyAll();
                    p[ pw[fork.status] ].notify();           
                    pw[fork.status] = -1;
 
            }
        }
    }
     
 
    class philosopher extends Thread {
         
       int num;                //哲学家编号
       boolean isHungry;            //哲学家是否饥饿

        public philosopher(int num) {
            this.num = num ;
        }
 
        public void run() {
 
            while (true) {
            // isHungry = Math.round(Math.random()*1) == 0 ? false : true;
            // if(isHungry){
            eat();
            // this.sleep(millis)
            // } else {
            /*
             * try { think(); this.sleep(Math.round(Math.random()*1000)); }
             * catch (InterruptedException e) { // TODO Auto-generated catch
             * block e.printStackTrace(); }
             */
            // }
 
            }
        }
 
    public void eat() {
     
        if (num % 2 == 1) {
            P(this,fork[num] );
                    System.out.println("哲学家" + num + "拿到左边第" + (num) + "号筷子");
        P(this,fork[(num+1)%5]);
                System.out.println("哲学家" + num + "拿到右边第" + (num+1) % 5 + "号筷子");
        try {
                System.out.println("哲学家" + num + "在吃饭");
                this.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        V(this, fork[num]);
                System.out.println("哲学家" + num + "放下左边第" + (num) + "号筷子");
        V(this, fork[(num+1)%5]);
                System.out.println("哲学家" + num + "放下右边第" + (num+1)%5 + "号筷子");
    } else {
        P(this,fork[(num+1)%5]);
                System.out.println("哲学家" + num + "拿到右边第" + (num+1) % 5 + "号筷子");
        P(this,fork[num] );
                System.out.println("哲学家" + num + "拿到左边第" + (num) + "号筷子");
 
                try {
                        System.out.println("哲学家" + num + "在吃饭");
                this.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        V(this, fork[num]);
                System.out.println("哲学家" + num + "放下左边第" + (num) + "号筷子");
        V(this, fork[(num+1)%5]);
                System.out.println("哲学家" + num + "放下右边第" + (num+1)%5 + "号筷子");
 
            }
 
        }
 
    public void think() {
        System.out.println("哲学家" + num + "在思考");
    }
 
}
 
     
 
    public void init() {
 
        for (int i = 0; i < 5; i++) {            //初始化5根筷子
            fork[i] = new Semaphore(1,i);
        }
        for (int i = 0; i < 5; i++) {            //初始化5个哲学家和5个线程标志pw
            p[i] = new philosopher(i);
            pw[i] = -1;
        }
         
 
        for (int i = 0; i < 5; i++) {
            p[i].start();
        }
 
    }
 
    public static void main(String[] args) {
 
        new PhilosopherProblem().init();
    }
 
}