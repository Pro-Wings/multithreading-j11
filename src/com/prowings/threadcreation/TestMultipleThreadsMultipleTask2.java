package com.prowings.threadcreation;

public class TestMultipleThreadsMultipleTask2 {
	
	public static void main(String[] args) {
		
		ThreadOne t1 = new ThreadOne("Cut the ticket!!");
		ThreadOne t2 = new ThreadOne("Show the seat!!");
		
		t1.start();
		t2.start();
		
	}

}
