package com.prowings.threadcreation;

public class TestDisplay {

	public static void main(String[] args) {
		
		Display display = new Display();
		Display display1 = new Display();
		Display display2 = new Display();

		DisplayThread t1 = new DisplayThread(display, "hello");
		DisplayThread t2 = new DisplayThread(display1, "hiiii");
		DisplayThread t3 = new DisplayThread(display2, "world");

		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		
		
		t1.start();
		t2.start();
		t3.start();
	}
}
