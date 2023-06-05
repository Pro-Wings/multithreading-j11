package com.prowings.threadcreation;

public class MyThread1 extends Thread{

	@Override
	public void run() {
		
		System.out.println("mythread running!!!");
		
		System.out.println(Thread.currentThread().getName());
		
		int res = 0;
		
		res = 20/2;
		System.out.println(res);
	}
	
	

}
