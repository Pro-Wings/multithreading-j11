package com.prowings.threadcreation;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Mythread2 running!!");
		
		System.out.println(Thread.currentThread().getName());
		
	}

	
	

}
