package com.prowings.threadcreation;

public class ThreadYieldMethodDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread1 t1 = new MyThread1("T1");

		MyThread2 mt2 = new MyThread2();
		
		Thread t2 = new Thread(mt2,"T2");
		
		t1.setPriority(8);
		t2.setPriority(8);

		t1.start();
//		t1.join();
		t2.start();
		t2.yield();
		
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		
	}

}
