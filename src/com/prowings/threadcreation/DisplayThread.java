package com.prowings.threadcreation;

public class DisplayThread extends Thread {

	Display obj;

	String msg;

	public DisplayThread() {
	}

	public DisplayThread(Display obj, String msg) {
		super();
		this.obj = obj;
		this.msg = msg;
	}

	public void run() {

//		synchronized(obj) 
//		{
			obj.print(msg);
//		}
	}

}
