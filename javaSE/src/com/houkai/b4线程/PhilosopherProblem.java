package com.houkai.b4�߳�;
//�ź���
class Semaphore {
    int status;             //���ӵ�ǰ״̬
    int num;                //���ӱ��
    public Semaphore(int status, int num) {    //�����ź���
        this.status = status;
        this.num = num;
    }
}

public class PhilosopherProblem {
	//5���� 5֧����
    static Semaphore fork[] = new Semaphore[5];
    philosopher p[] = new philosopher[5];
    int pw[] = new int[5];  //��¼�ĸ���������ѧ���ڵȴ�
     
 
    public synchronized void P(philosopher phi, Semaphore fork) {   //p����
        fork.status--;
         
        if (fork.status < 0) {
            try {
                pw[fork.num] = phi.num;//�������Ѿ���ռ�õ�ʱ����pw����¼�ĸ���������ѧ���ڵȴ���
                    this.wait();                     
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
 
    public synchronized void V(philosopher phi, Semaphore fork) {  //V����
        fork.status++;
        if (fork.status <= 0) {             
            if (pw[fork.status] != -1) {//����շ��µĿ���������ѧ���ڵȣ���鿴pw�����ĸ���ѧ�ң�Ȼ�������������ѧ�ҳ�   
                //notifyAll();
                    p[ pw[fork.status] ].notify();           
                    pw[fork.status] = -1;
 
            }
        }
    }
     
 
    class philosopher extends Thread {
         
       int num;                //��ѧ�ұ��
       boolean isHungry;            //��ѧ���Ƿ񼢶�

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
                    System.out.println("��ѧ��" + num + "�õ���ߵ�" + (num) + "�ſ���");
        P(this,fork[(num+1)%5]);
                System.out.println("��ѧ��" + num + "�õ��ұߵ�" + (num+1) % 5 + "�ſ���");
        try {
                System.out.println("��ѧ��" + num + "�ڳԷ�");
                this.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        V(this, fork[num]);
                System.out.println("��ѧ��" + num + "������ߵ�" + (num) + "�ſ���");
        V(this, fork[(num+1)%5]);
                System.out.println("��ѧ��" + num + "�����ұߵ�" + (num+1)%5 + "�ſ���");
    } else {
        P(this,fork[(num+1)%5]);
                System.out.println("��ѧ��" + num + "�õ��ұߵ�" + (num+1) % 5 + "�ſ���");
        P(this,fork[num] );
                System.out.println("��ѧ��" + num + "�õ���ߵ�" + (num) + "�ſ���");
 
                try {
                        System.out.println("��ѧ��" + num + "�ڳԷ�");
                this.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        V(this, fork[num]);
                System.out.println("��ѧ��" + num + "������ߵ�" + (num) + "�ſ���");
        V(this, fork[(num+1)%5]);
                System.out.println("��ѧ��" + num + "�����ұߵ�" + (num+1)%5 + "�ſ���");
 
            }
 
        }
 
    public void think() {
        System.out.println("��ѧ��" + num + "��˼��");
    }
 
}
 
     
 
    public void init() {
 
        for (int i = 0; i < 5; i++) {            //��ʼ��5������
            fork[i] = new Semaphore(1,i);
        }
        for (int i = 0; i < 5; i++) {            //��ʼ��5����ѧ�Һ�5���̱߳�־pw
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