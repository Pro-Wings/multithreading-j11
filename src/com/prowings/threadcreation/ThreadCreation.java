package com.prowings.threadcreation;

public class ThreadCreation {
	
	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1(); //extending Thread class
		
		t1.start();
		t1.setName("MyThread1");

		MyThread2 t2 = new MyThread2(); //implementing Runnable
		
		Thread mythread2 = new Thread(t2);
		mythread2.start();
		mythread2.setName("MyThread2");
		
		System.out.println(Thread.currentThread().getName());
	}

}
