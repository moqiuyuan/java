package com.houkai.c9例子___定时器�

import java.util.Timer;
import java.util.TimerTask;

public class Demo {
	public static void main(String[] args) {
		Timer timer = new Timer();
		//void java.util.Timer.schedule(TimerTask task, long delay)
		//Schedules the specified task for execution after the specified delay.
		//['蕛edju藧l; 'sked-]
		timer.schedule(new MyTask(), 3000,5000);
		//timer.start();
	}
}

class MyTask extends TimerTask{
	@Override
	public void run() {
		System.out.println("鏃堕棿鍒颁簡锛屾垜鎵ц浜�");
	}
}


