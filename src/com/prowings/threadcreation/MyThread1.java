package com.prowings.threadcreation;

public class MyThread1 extends Thread {

	String name;

	public MyThread1(String name) {
		super(name);
	}
	public MyThread1() {
		super();
	}

	@Override
	public void run() {

		System.out.println("mythread1 running!!!");

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "   " + i);
		}

	}

}
