package com.prowings.interthreadcomm;

public class ProducerThread extends Thread {

	PC pc;

	public ProducerThread() {
		super();
	}

	public ProducerThread(PC obj) {
		super();
		this.pc = obj;
	}

	public void run() {
		try {
			pc.produce();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
