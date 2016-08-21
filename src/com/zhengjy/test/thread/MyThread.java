package com.zhengjy.test.thread;

public class MyThread extends Thread{
	public static void main(String[] args) {
		MyThread2 m1 = new MyThread2();
		MyThread2 m2 = new MyThread2();
		MyThread2 m3 = new MyThread2();
		m1.start();
		m2.start();
		m3.start();
	}
}
class MyThread2 extends Thread{
	private static int ticket=10;
	public void run(){
		for(int i=0;i<20;i++){
			if(ticket>0){
				System.out.println(Thread.currentThread().getName()+"卖票：ticket"+this.ticket--);
			}
		}
	}
}