package com.prowings.threadcreation;

public class MHT2 extends Thread{

	Print p;

	public MHT2(Print p) {
		super();
		this.p = p;
	}
	
	public void run()
	{
		System.out.println("MTH2 running!!!");
		p.printMsg("Hello");
	}
	
}
