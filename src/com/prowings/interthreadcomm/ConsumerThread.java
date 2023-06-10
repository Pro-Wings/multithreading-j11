package com.prowings.interthreadcomm;

public class ConsumerThread extends Thread {

	PC pc;

	public ConsumerThread() {
		super();
	}

	public ConsumerThread(PC obj) {
		super();
		this.pc = obj;
	}

	public void run() {
		try {
			pc.consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
