package com.prowings.threadcreation;

public class MHT1 extends Thread{

	Print p;

	public MHT1(Print p) {
		super();
		this.p = p;
	}
	
	public void run()
	{
		System.out.println("MTH1 running!!!");
		p.printMsg("Hii");
	}
	
}
