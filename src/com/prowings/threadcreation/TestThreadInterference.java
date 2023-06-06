package com.prowings.threadcreation;

public class TestThreadInterference {
	
	public static void main(String[] args) {
		
		Counter obj = new Counter();
		
		MT1 t1 = new MT1(obj);
		MT2 t2 = new MT2(obj);
		
		t1.start();
		t2.start();
		
	}

}
